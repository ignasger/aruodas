import lt.aruodas.BuyRE;
import lt.aruodas.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;

public class adTest {

    public static WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        Helper.driverInit();
        driver = Helper.driver;
        acceptCookies();
    }

    @AfterClass
    public void afterClass(){
        //driver.quit();
    }

    public void acceptCookies(){
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void aruodaslt(){
        BuyRE ad = new BuyRE("", "", "", "", "", "", "", "", "", "", "", "");
        ad.fillAd();
    }

}

