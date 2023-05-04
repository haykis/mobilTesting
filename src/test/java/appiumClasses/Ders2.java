package appiumClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Useful;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class Ders2 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "1fd655780409");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\Guest\\workspace\\Cucumber\\mobilTesting\\src\\APPS\\chromedriver2.exe");
       // desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Guest\\workspace\\Cucumber\\mobilTesting\\src\\APPS\\GestureTool.apk");


//        desiredCapabilities.setCapability("appPackage", "com.android.dialer");
//        desiredCapabilities.setCapability("appActivity", "com.android.dialer.main.impl.MainActivity");

        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url, desiredCapabilities);
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

//        Set contex=driver.getContextHandles();
//        System.out.println("contex = " + contex);
//
//        for (Object contexName:contex) {
//            System.out.println("contexName = " + contexName);
//            Thread.sleep(5000);
//            //NativeApp
//            if(contexName.toString().contains("CHROMIUM")){
//                driver.context((String)contexName);
//            }
//        }
        System.out.println("uygulama her iki durumda da kullanilabilir");
        System.out.println("son durum= "+driver.getContext());

        driver.findElementByXPath("//*[@name='k']").sendKeys("glasses");
        Thread.sleep(3000);
        driver.findElementByXPath("//*[@class='nav-input']").click();


    }
}
