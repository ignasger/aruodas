package lt.aruodas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    public static void driverInit() {
        if(RealEstate.driver = null){
            break;
        }
        RealEstate.driver = new ChromeDriver();
        RealEstate.wait = new WebDriverWait(RealEstate.driver, Duration.ofSeconds(3));
        RealEstate.driver.manage().window().maximize();
        RealEstate. driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        acceptCookies();
    }

    public static void acceptCookies(){
        RealEstate.driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        RealEstate.driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

}
