package br.com.apparezzo.stepdef;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hook {
		
	public static AndroidDriver<WebElement> driver;
	public static WebDriverWait wait;

	@Before
	public void OpenApp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel_3_API_27");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", getAppPackage());
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("app",new File("src/test/resources/appdriver/"+ Utils.getBrand()+".apk"));
		cap.setCapability("appWaitActivity", getAppPackage()+".*");
		cap.setCapability("appWaitPackage", getAppPackage());
		cap.setCapability("newCommandTimeout", 20000);
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static AndroidDriver<WebElement> getDriver() throws MalformedURLException{
		return driver;
	}

	public static WebDriverWait waiting(){
		wait = new WebDriverWait(driver, 30);
		return wait;
	}

	public String getAppPackage() {
		String appPackage = "";
		if (Utils.getBrand() == "arezzo") {
			appPackage = "br.com.arezzo";
		}
		if (Utils.getBrand() == "schutz") {
			appPackage = "br.com.arezzo.schutz";
		}
		return appPackage;
	}

	@After
	public void CloseApp() throws MalformedURLException {
		driver.closeApp();
		driver.quit();
	}

}
