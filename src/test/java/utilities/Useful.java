package utilities;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Useful {
    public static void waitBasic(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitIf(WebElement element, int timeout){ //fluent wait
        for(int i=0;i<timeout;i++){
            try{
                element.click();
                break;
            }catch (WebDriverException e){
                waitBasic(1);
            }
        }
    }
}
