package appiumClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class UIselector {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"1fd655780409");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Guest\\workspace\\Cucumber\\mobilTesting\\src\\APPS\\GestureTool.apk");

        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");           //"http://localhost:4723/wd/hub"  "http://127.0.0.1:4723/wd/hub"
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url,desiredCapabilities);
        Thread.sleep(3000);

        driver.findElementById("com.davemac327.gesture.tool:id/addButton");
//     driver.findElement(By.id("com.davemac327.gesture.tool:id/addButton"));
        //UISelector
        //UISelector  '  ' kabul etmiyor, "kullanmak gerekiyor"
        //driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"<value>\")");
        //UISelector id
        //  driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"<com.davemac327.gesture.tool:id/addButton>\")");
        //UISelector class name
        // driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(2)").click();
        //elementin ozelliklerini kontrol etme clickable?  checkable?
        System.out.println("clickable " +driver.findElementByAndroidUIAutomator
                ("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").clickable(true)").getAttribute("clickable"));
        System.out.println("checkable " +driver.findElementByAndroidUIAutomator
                ("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").checkable(false)").getAttribute("checkable"));
    }
}