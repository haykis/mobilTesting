package appiumClasses;

import com.github.javafaker.Faker;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import utilities.BaseChrome;

import java.net.MalformedURLException;

public class EtsOdev extends BaseChrome {

    @Test
    public void ets() throws MalformedURLException, InterruptedException {

        AndroidDriver driver=getDriver();
        driver.get("https://www.etsy.com/");
        Thread.sleep(3000);
        driver.findElementByXPath("(//button)[13]").click();
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(10,15,true,true,true);
        driver.findElementByXPath("//a[@class='wt-btn wt-btn--small wt-btn--transparent wt-btn--icon wt-btn--transparent-flush-right']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//button[@class='wt-btn wt-btn--secondary wt-btn--small']").click();
        Thread.sleep(3000);
        driver.findElementById("sign-in").click();
        Thread.sleep(3000);
        driver.findElementById("join_neu_email_field").sendKeys(email);
        Thread.sleep(3000);
        driver.findElementById("join_neu_password_field").sendKeys(password);
        Thread.sleep(3000);
        driver.findElementByXPath("//button[@class='wt-btn wt-btn--primary wt-width-full']").click();
    }
}
