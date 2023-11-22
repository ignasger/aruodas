package lt.aruodas.Models;

import org.openqa.selenium.By;

public class Plot extends RealEstate {

    public String addressNumber;
    public String rcNumber;
    public String purposes;
    public String spaces;
    public String features;

    public Plot(String municipality, String settlement, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email, String addressNumber, String rcNumber, String purposes, String spaces, String features) {
        super(municipality, settlement, microdistrict, street, description, imageUrl, youtubeUrl, virtualTour, price, phone, email);
        this.addressNumber = addressNumber;
        this.rcNumber = rcNumber;
        this.purposes = purposes;
        this.spaces = spaces;
        this.features = features;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        super.fillAd();
        setAddressNumber();
        setRcNumber();
        setPurposes();
        setSpaces();
        setFeatures();
    }

    public void setSpaces() {
        driver.findElement(By.name("FAreaOverAll")).sendKeys(this.spaces);
    }

    public void setAddressNumber() {
        driver.findElement(By.name("FHouseNum")).sendKeys(this.addressNumber);
    }

    public void setRcNumber() {
        driver.findElement(By.name("RCNumber")).sendKeys(this.rcNumber);
    }

    public void setFeatures() {
        driver.findElement(By.className("bigObjBtn")).click();
        String[] features = this.features.replace(", ", ",").split(",");
        for (int i = 0; i < features.length; i++) {

            switch (features[i]) {
                case "Elektra":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[1]/label")).click();
                    break;
                case "Dujos":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[2]/label")).click();
                    break;
                case "Vanduo":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[3]/label")).click();
                    break;
                case "Kraštinis sklypas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[4]/label")).click();
                    break;
                case "Greta miško":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[5]/label")).click();
                    break;
                case "Be pastatų":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[6]/label")).click();
                    break;
                case "Geodeziniai matavimai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[7]/label")).click();
                    break;
                case "Su pakrante":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[8]/label")).click();
                    break;
                case "Asfaltuotas privažiavimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[9]/label")).click();
                    break;
                case "Domina keitimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div/div/label")).click();
                    break;
                case "Varžytinės/aukcionas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/div/div/div/label")).click();
                    break;
            }
        }
    }

    public void setPurposes() {
        String[] purposes = this.purposes.replace(", ", ",").split(",");
        for (int i = 0; i < purposes.length; i++) {
            switch (purposes[i]) {
                case "Namų valda":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[1]/label")).click();
                    break;
                case "Daugiabučių statyba":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[2]/label")).click();
                    break;
                case "Žemės ūkio":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[3]/label")).click();
                    break;
                case "Sklypas soduose":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[4]/label")).click();
                    break;
                case "Miškų ūkio":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[5]/label")).click();
                    break;
                case "Pramonės":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[6]/label")).click();
                    break;
                case "Sandėliavimo":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[7]/label")).click();
                    break;
                case "Komercinė":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[8]/label")).click();
                    break;
                case "Rekreacinė":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[9]/label")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[10]/label")).click();
                    break;
            }
        }
    }

}










































