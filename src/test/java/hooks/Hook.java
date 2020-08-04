package hooks;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableMap;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import utilities.CommonUtility;

public class Hook extends TestBase {

	public static Properties prop;

	public static Properties propertyFile;

	public static Logger log = LoggerFactory.getLogger(Hook.class);

	public static DesiredCapabilities capabilities = new DesiredCapabilities();

	TestBase base;

	public Hook(TestBase base) {
		this.base = base;
	}

	CommonUtility commonUtility = new CommonUtility();

	@Before
	public void setUp() throws MalformedURLException {

//		PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/resources/properties/Log4j.properties");
//		PropertyConfigurator.configure(Hook.class.getClassLoader().getResourceAsStream("properties/Log4j.properties"));

		prop = loadProperty("properties/config.properties");
		String loadPropertyFile = prop.getProperty("platform_Property");
		System.out.println("Property File To Read:: " + loadPropertyFile);

		if (loadPropertyFile.startsWith("Android_")) {
			propertyFile = loadProperty("properties/Android_Capabilities.properties");
			capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("resetKeyboard", true);
		} else if (loadPropertyFile.startsWith("IOS_")) {
			propertyFile = loadProperty("properties/IOS_Capabilities.properties");
//			capabilities.setCapability(MobileCapabilityType.UDID, propertyFile.getProperty("udid"));
			capabilities.setCapability(IOSMobileCapabilityType.START_IWDP, true);
			capabilities.setCapability(IOSMobileCapabilityType.SAFARI_ALLOW_POPUPS, true);
			capabilities.setCapability(IOSMobileCapabilityType.SAFARI_OPEN_LINKS_IN_BACKGROUND, true);
			capabilities.setCapability("connectHardwareKeyboard", false);

		}
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "v1.17.1");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, propertyFile.getProperty("automationName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, propertyFile.getProperty("platformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertyFile.getProperty("platformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, propertyFile.getProperty("deviceName"));
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, propertyFile.getProperty("browserName"));
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("autoGrantPermissions", true);
//		capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, false);
		capabilities.setCapability("autoDismissAlerts", true);
		capabilities.setCapability("–session-override", true);

		System.out.println("Capabilities::: " + capabilities);
//		log.info("Capabilities::: " + capabilities);

		try {
			driver = new AppiumDriver<MobileElement>(new URL(prop.getProperty("URL_Capability")), capabilities);
//			log.info("Initializing driver ::: " + driver);
			if (driver != null) {
//				log.info("SetUp Appium Driver for Device = " + capabilities);

				driver.get(prop.getProperty("APP_URL"));
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//				wait = new WebDriverWait(this.driver, 90);

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
