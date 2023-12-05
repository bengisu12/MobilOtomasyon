import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element extends Method{
    static By laterButton = By.id("com.mobisoft.kitapyurdu:id/btnLaterOn");

    static By araButonu = By.id("com.mobisoft.kitapyurdu:id/navigation_search");
    static By aramaInput = By.id("com.mobisoft.kitapyurdu:id/searchEditText");
    static By text = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/list_content\" and @text=\"harry potter\"]");
    static By sıralaButton = By.id("com.mobisoft.kitapyurdu:id/sortButton");
    static By cokDegerdirilenler = By.xpath("(//android.view.ViewGroup[@resource-id=\"com.mobisoft.kitapyurdu:id/containerView\"])[9]/android.view.ViewGroup");
    static By rastgeleSecim =By.xpath("(//android.widget.ImageView[@content-desc=\"Ürün görseli\"])");
    static By sepeteEkle = By.id("com.mobisoft.kitapyurdu:id/addToCartNormalView");
    static By fiyat = By.id("com.mobisoft.kitapyurdu:id/textViewSellPriceBottom");
    static By girisYap = By.xpath("//android.widget.RelativeLayout[@content-desc=\"Giriş Yap / Üye Ol\"]");
    static By ePosta = By.id("com.mobisoft.kitapyurdu:id/textview_mail");
    static By sifre = By.id("com.mobisoft.kitapyurdu:id/textview_password");
    static By girisYap2 = By.id("com.mobisoft.kitapyurdu:id/loginButton");
    static By sepetim = By.xpath("//android.widget.FrameLayout[@content-desc=\"Sepetim\"]/android.widget.FrameLayout");
    static By sepetFiyatı = By.id("com.mobisoft.kitapyurdu:id/textViewTotal");
    static By silButton = By.id("com.mobisoft.kitapyurdu:id/buttonDelete");
    static By silPopUp = By.xpath("//android.widget.RelativeLayout[@content-desc=\"Sil\"]");
    static By sepetinizBos =By.id("com.mobisoft.kitapyurdu:id/textViewErrorMessage");
    static By AnaSayfa = By.id("com.mobisoft.kitapyurdu:id/navigation_home");
    static By Hesabım = By.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account");
    static By çıkışYap = By.id("com.mobisoft.kitapyurdu:id/ln_logout");
    static By tamamButton = By.id("com.mobisoft.kitapyurdu:id/confirmButton");





}
