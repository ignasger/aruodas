package lt.aruodas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class BuyRE {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public String municipality;
    public String village;
    public String microdistrict;
    public String street;
    public String objecttype;
    public String description;
    public String imageUrl;
    public String youtubeUrl;
    public String virtualTour;
    public String price;
    public String phone;
    public String email;

    public BuyRE(String municipality, String village, String microdistrict, String street, String objecttype, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email) {
        this.municipality = municipality;
        this.village = village;
        this.microdistrict = microdistrict;
        this.street = street;
        this.objecttype = objecttype;
        this.description = description;
        this.imageUrl = imageUrl;
        this.youtubeUrl = youtubeUrl;
        this.virtualTour = virtualTour;
        this.price = price;
        this.phone = phone;
        this.email = email;
    }

    public void fillAd() {
        fillAdPage();
    }

    public void fillAdPage() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");

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
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"streets_6\"]/li[1]/input")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/span")).click();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[13]/div/div[1]/textarea")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[13]/div/div[1]/textarea")).sendKeys(this.description);
        File resourceFile = new File("images/" + this.imageUrl);
        driver.findElement(By.xpath("//*[@id=\"uploadPhotoBtn\"]/input")).sendKeys(resourceFile.getAbsolutePath());
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/span[1]/input")).sendKeys(this.youtubeUrl);
        driver.findElement(By.xpath("//*[@id=\"priceField\"]")).sendKeys(this.price);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/span[1]/input")).sendKeys(this.phone);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/span[1]/input")).sendKeys(this.email);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[25]/span[1]/div/div/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"submitFormButton\"]")).click();



    }


}

