package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.Dimension;


import java.net.MalformedURLException;
import java.time.Duration;

public class Scrolling extends Base{
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver=lunchAndroid();
        Thread.sleep(3000);

        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        Thread.sleep(3000);

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        Thread.sleep(3000);
        Dimension dimension = driver.manage().window().getSize();

        int start_x=(int)(dimension.height*0.5);
        int start_y=(int)(dimension.height*0.8);
        Thread.sleep(3000);
        int eind_x=(int)(dimension.width*0.5);
        int eind_y=(int)(dimension.width*0.2);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(eind_x, eind_y)).release().perform();
        Thread.sleep(3000);




    }
}
