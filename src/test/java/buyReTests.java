import lt.aruodas.BuyRE;
import lt.aruodas.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class buyReTests {

    public static WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        Helper.driverInit();
        driver = Helper.driver;
        acceptCookies();
    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
    }

    public void acceptCookies() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void aruodasLtPositiveTest() {
        BuyRE re = new BuyRE("Kaunas", "", "Šilainiai", "9-ojo", "", "Pigiai nebrangiai nupirksiu jūsų namą", "nameliumbas.jpg", "https://www.youtube.com/watch?v=9xkxT2hY634&pp=ygUTbHV4dXJ5IGhvdXNlIHJldmlldw%3D%3D", "", "220000", "65214726", "sacebi1448@marksia.com");
        re.fillAd();
        Assert.assertEquals("", "");
    }

}

