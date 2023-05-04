package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseChrome {
    public static AndroidDriver getDriver() throws MalformedURLException, InterruptedException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");

            desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\Guest\\workspace\\Cucumber\\mobilTesting\\src\\APPS\\chromedriver2.exe");

            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            AndroidDriver<WebElement> driver = new AndroidDriver<>(url, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;

    }
}
