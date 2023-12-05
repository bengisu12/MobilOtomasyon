import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Hook {
    protected static AppiumDriver androidDriver;
    @Before
    public void Startup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage","com.mobisoft.kitapyurdu");
        capabilities.setCapability("appActivity","com.mobisoft.kitapyurdu.main.SplashActivity");
        capabilities.setCapability("platformName","Android");
        androidDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }
    @After
    public void classDriver(){
        if (androidDriver != null){
            androidDriver.quit();
        }

    }
}
