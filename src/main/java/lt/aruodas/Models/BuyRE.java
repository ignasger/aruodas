package lt.aruodas.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuyRE extends RealEstate {

    public String objectType;

    public BuyRE(String municipality, String settlement, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email, String objectType) {
        super(municipality, settlement, microdistrict, street, description, imageUrl, youtubeUrl, virtualTour, price, phone, email);
        this.objectType = objectType;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        super.fillAd();
        setObjectType();
    }

    public void setObjectType() {                 //*[@id="newObjectForm"]/ul/li[7]/span[1]/span
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/span")).click();
        List<WebElement> objectTypes = driver.findElement(By.className("dropdown-input-values")).findElements(By.tagName("li"));
        for (WebElement objectType : objectTypes) {
           if (objectType.getText().equalsIgnoreCase(this.objectType)) {
                objectType.click();
               break;
            }
        }
   }


}

