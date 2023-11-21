package lt.aruodas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RealEstate {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public String municipality;
    public String village;
    public String microdistrict;
    public String street;
    public String objectType;
    public String description;
    public String imageUrl;
    public String youtubeUrl;
    public String virtualTour;
    public String price;
    public String phone;
    public String email;


    public RealEstate(String municipality, String village, String microdistrict, String street, String objectType, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email) {
        this.municipality = municipality;
        this.village = village;
        this.microdistrict = microdistrict;
        this.street = street;
        this.objectType = objectType.toLowerCase();
        this.description = description;
        this.imageUrl = imageUrl;
        this.youtubeUrl = youtubeUrl;
        this.virtualTour = virtualTour;
        this.price = price;
        this.phone = phone;
        this.email = email;
    }

    public void fillAd(){
        setLocation();

    }
}

    public void setLocation() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[1]/input")).sendKeys(this.municipality);
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[1]/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"quartalField\"]/span[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"quartals_6\"]/li[1]/input")).sendKeys(this.microdistrict);
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"quartals_6\"]/li[1]/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"streetField\"]/span[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"streets_6\"]/li[1]/input")).sendKeys(this.street);
        driver.findElement(By.xpath("//*[@id=\"streets_6\"]/li[1]/input")).sendKeys(Keys.ENTER);



    }
