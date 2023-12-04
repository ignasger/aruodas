package lt.aruodas.Models;

import org.openqa.selenium.By;

public class Garage extends RealEstate {

    public String addressNumber;
    public String rcNumber;
    public String spaces;
    public String features;
    public String action;
    public String type;
    public String carsSpaces;

    public Garage(String municipality, String settlement, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email, String addressNumber, String rcNumber, String spaces, String features, String action, String type, String carsSpaces) {
        super(municipality, settlement, microdistrict, street, description, imageUrl, youtubeUrl, virtualTour, price, phone, email);
        this.addressNumber = addressNumber;
        this.rcNumber = rcNumber;
        this.spaces = spaces;
        this.features = features;
        this.action = action;
        this.type = type;
        this.carsSpaces = carsSpaces;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=13");
        super.fillAd();
        setAddressNumber();
        setRcNumber();
        setSpaces();
        setFeatures();
        setAction();
        setType();
        setCarSpaces();
    }

    public void setCarSpaces() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[2]/div[2]")).click();
    }

    public void setType() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[1]/div[2]")).click();
    }

    public void setAction() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[15]/div/div[1]/div[2]")).click();
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
        driver.findElement(By.id("showMoreFields")).click();
        String[] features = this.features.replace(", ", ",").split(",");
        for (int i = 0; i < features.length; i++) {

            switch (features[i]) {
                case "Apsauga":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/label/span")).click();
                    break;
                case "Automatiniai vartai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[2]/label/span")).click();
                    break;
                case "Duobė":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[3]/label/span")).click();
                    break;
                case "Rūsys":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[4]/label/span")).click();
                    break;
                case "Vanduo":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[5]/label/span")).click();
                    break;
                case "Šildymas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[6]/label/span")).click();
                    break;
                case "Domina Keitimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[26]/div/div/div/label/span")).click();
                    break;
                case "Varžytynės/aukcionas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div/div/label/span")).click();
            }
        }
    }
}










































