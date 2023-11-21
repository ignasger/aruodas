package lt.aruodas.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

    public class BuyRE extends RealEstate {

    public String objectType;

    public BuyRE(String municipality, String village, String microdistrict, String street, String objectType, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email) {
      super(municipality, village, microdistrict. street, objectType, description, imageUrl, youtubeUrl, virtualTour, price, email);
      this.objectType = objectType.toLowerCase();
    }

    @Override
    public void fillre() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        super.fillAd();
        setObjectType();

    }

    public void setObjectType() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/span")).click();
        List<WebElement> objectTypes = driver.findElement(By.className("dropdown-input-values")).findElements(By.tagName("li"));
        for (WebElement objectType : objectTypes) {
            if (objectType.getText().toLowerCase().equals(this.objectType)) {
                objectType.click();
                break;
            }
        }
    }



}

