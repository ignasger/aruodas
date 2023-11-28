package lt.aruodas;

import lt.aruodas.Models.Garage;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void driverInit() {
        if (RealEstate.driver != null) {
            return;
        }

        RealEstate.driver = new ChromeDriver();
        RealEstate.wait = new WebDriverWait(RealEstate.driver, Duration.ofSeconds(3));
        RealEstate.driver.manage().window().maximize();
        RealEstate.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        acceptCookies();
    }

    public static void acceptCookies() {
        RealEstate.driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        RealEstate.driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

}
