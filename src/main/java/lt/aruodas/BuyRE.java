package lt.aruodas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyRE {
    public static WebDriver driver;
    public String municipality;
    public String village;
    public String microdistrict;
    public String street;
    public String objecttype;
    public String description;
    public String photo;
    public String youtubeUrl;
    public String virtualTour;
    public String price;
    public String phone;
    public String email;

    public BuyRE(String municipality, String village, String microdistrict, String street, String objecttype, String description, String photo, String youtubeUrl, String virtualTour, String price, String phone, String email) {
        this.municipality = municipality;
        this.village = village;
        this.microdistrict = microdistrict;
        this.street = street;
        this.objecttype = objecttype;
        this.description = description;
        this.photo = photo;
        this.youtubeUrl = youtubeUrl;
        this.virtualTour = virtualTour;
        this.price = price;
        this.phone = phone;
        this.email = email;
    }

    public void fillAd(){
        fillAdPage();
    }

    public void fillAdPage (){
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();

    }











}

