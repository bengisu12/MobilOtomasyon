import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class Method extends Hook{

    private Logger logger = LoggerFactory.getLogger(getClass());
    public void Bekle(int saniye) throws InterruptedException {
        Thread.sleep(saniye*1000);
    }
    public void tıkla(By element) throws InterruptedException {
        androidDriver.findElement(element).click();
        logger.info(element+"elementine tıklandı");
        Bekle(5);
    }
    public void textYaz(By element,String text) throws InterruptedException {
        androidDriver.findElement(element).sendKeys(text);
        logger.warn(element+"elementine"+text+"tıklandı");
        Bekle(5);

    }
    public void RandomResmeTıkla(By element,int index) throws InterruptedException {
        androidDriver.findElements(element).get(index).click();
        logger.info(element +" "+ index+". random resme tıklandı");
        Bekle(5);
    }


}
