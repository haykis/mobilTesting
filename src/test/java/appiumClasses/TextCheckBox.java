package appiumClasses;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;

import java.net.MalformedURLException;

import static utilities.Base.lunchAndroid;

public class TextCheckBox{
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver=lunchAndroid();

        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        Thread.sleep(3000);
        driver.findElementById("android:id/checkbox").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(3000);
        driver.findElementById("android:id/edit").sendKeys("Hello world");
        Thread.sleep(3000);
        driver.findElementById("android:id/button1").click();



    }

}
