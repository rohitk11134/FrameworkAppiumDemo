package hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import utilities.CommonUtility;


public class Hook extends TestBase {

	public static Properties prop;

	public static Properties propertyFile;

	public static Logger log = Logger.getLogger(TestBase.class);

	public static DesiredCapabilities capabilities = new DesiredCapabilities();

	String prop_filePath = System.getProperty("user.dir") + "/src/test/resources/properties/config.properties";

	TestBase base;

	CommonUtility commonUtility = new CommonUtility();

	public Hook(TestBase base) {
		this.base = base;
	}

	@Before
	public void setUp() throws MalformedURLException {

		PropertyConfigurator
				.configure(System.getProperty("user.dir") + "/src/test/resources/properties/Log4j.properties");

		prop = loadProperty(prop_filePath);

		String loadPropertyFile = prop.getProperty("loadPropertyFile");
		System.out.println("Property File To Read:: " + loadPropertyFile);

		if (loadPropertyFile.startsWith("Android_")) {
			propertyFile = loadProperty(
					System.getProperty("user.dir") + "/src/test/resources/properties/Android_Capabilities.properties");
		} else if (loadPropertyFile.startsWith("IOS_")) {
			propertyFile = loadProperty(
					System.getProperty("user.dir") + "/src/test/resources/properties/IOS_Capabilities.properties");
		}

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, propertyFile.getProperty("automationName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, propertyFile.getProperty("platformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertyFile.getProperty("platformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, propertyFile.getProperty("deviceName"));
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, propertyFile.getProperty("browserName"));
		capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));



		log.info("Capabilities::: " + capabilities);

		try {
			driver = new AppiumDriver<MobileElement>(new URL(prop.getProperty("URL_Capability")), capabilities);
			log.info("Initializing driver ::: " + driver);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			if (driver != null) {
				log.info("SetUp Appium Driver for Device = " + capabilities);
				driver.get(prop.getProperty("APP_URL"));
				wait = new WebDriverWait(this.driver, 30);

			}
//			wait = new WebDriverWait(this.driver, 30);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public Properties loadProperty(String filePath) {
		Properties property = new Properties();
		try {
			FileInputStream fs = new FileInputStream(filePath);
			property.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property;
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			base.takeScreenShot(scenario.getName());
//			commonUtility.returnFailureOutcome(fileName, message)
//			base.resetApp();
		}
		base.deleteCookies();
		base.tearDown();

	}

}
