package hooks;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import utilities.CommonUtility;

public class Hook extends TestBase {

	public static Properties prop;

	public static Properties propertyFile;

//	public static Logger log = Logger.getLogger(TestBase.class);

	public static DesiredCapabilities capabilities = new DesiredCapabilities();

	String prop_filePath = "config.properties";

	TestBase base;

	public Hook(TestBase base) {
		this.base = base;
	}

	CommonUtility commonUtility = new CommonUtility();

	@Before
	public void setUp() throws MalformedURLException {

//		PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/resources/properties/Log4j.properties");

		prop = loadProperty("config.properties");
		String loadPropertyFile = prop.getProperty("platform_Property");
		System.out.println("Property File To Read:: " + loadPropertyFile);

		if (loadPropertyFile.startsWith("Android_")) {
			propertyFile = loadProperty("Android_Capabilities.properties");
			capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		} else if (loadPropertyFile.startsWith("IOS_")) {
			propertyFile = loadProperty("IOS_Capabilities.properties");
//			capabilities.setCapability(MobileCapabilityType.UDID, propertyFile.getProperty("udid"));
			capabilities.setCapability("connectHardwareKeyboard", false);

		}
//		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "v1.17.1");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, propertyFile.getProperty("automationName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, propertyFile.getProperty("platformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertyFile.getProperty("platformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, propertyFile.getProperty("deviceName"));
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, propertyFile.getProperty("browserName"));
//		capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, false);


		System.out.println("Capabilities::: " + capabilities);
//		log.info("Capabilities::: " + capabilities);

		try {
			driver = new AppiumDriver<MobileElement>(new URL(prop.getProperty("URL_Capability")), capabilities);
//			log.info("Initializing driver ::: " + driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (driver != null) {
//				log.info("SetUp Appium Driver for Device = " + capabilities);

				driver.get(prop.getProperty("APP_URL"));
				wait = new WebDriverWait(this.driver, 30);

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public Properties loadProperty(String filePath) {
		Properties prop = new Properties();
		try (InputStream input = Hook.class.getClassLoader().getResourceAsStream(filePath)) {

			if (input == null) {
				System.out.println("Sorry, unable to find config.properties");
				return prop;
			}

			// load a properties file from class path, inside static method
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return prop;
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			base.takeScreenShot(scenario.getName());
//			base.resetApp();
		}
		base.deleteCookies();
		base.tearDown();

	}

}
