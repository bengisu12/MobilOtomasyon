import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class Runner extends Hook{
    Method method = new Method();
    @Test
    public void StartTest() throws InterruptedException {


        method.Bekle(10);
        method.tıkla(Element.laterButton);
        method.tıkla(Element.laterButton);
        method.tıkla(Element.araButonu);
        method.tıkla(Element.aramaInput);
        method.textYaz(Element.aramaInput,"harry potter");
        Assert.assertEquals("harry potter",androidDriver.findElement(Element.text).getText());
        method.tıkla(Element.text);
        method.tıkla(Element.sıralaButton);
        method.tıkla(Element.cokDegerdirilenler);
        method.Bekle(5);
        int resimSayisi = androidDriver.findElements(Element.rastgeleSecim).size();
        Random random = new Random();
        int randomNumber = random.nextInt(resimSayisi)+1;
        method.RandomResmeTıkla(Element.rastgeleSecim,randomNumber);
        String fiyat = androidDriver.findElement(Element.fiyat).getText();
        method.tıkla(Element.sepeteEkle);
        method.tıkla(Element.girisYap);
        method.tıkla(Element.ePosta);
        method.textYaz(Element.ePosta,"bengisuolmez@hotmail.com");
        method.tıkla(Element.sifre);
        method.textYaz(Element.sifre,"kitapkitap");
        method.tıkla(Element.girisYap2);
        method.tıkla(Element.sepetim);
        String sepetFiyatı = androidDriver.findElement(Element.sepetFiyatı).getText();
        Assert.assertEquals(sepetFiyatı,androidDriver.findElement(Element.sepetFiyatı).getText());
        method.Bekle(10);
        method.tıkla(Element.silButton);
        method.tıkla(Element.silPopUp);
        Assert.assertEquals("Sepetiniz boş!",androidDriver.findElement(Element.sepetinizBos).getText());
        method.tıkla(Element.AnaSayfa);
        method.tıkla(Element.Hesabım);
        method.tıkla(Element.çıkışYap);
        method.tıkla(Element.tamamButton);















    }

}
