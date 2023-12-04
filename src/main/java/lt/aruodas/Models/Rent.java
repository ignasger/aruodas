package lt.aruodas.Models;

import org.openqa.selenium.By;

public class Rent extends RealEstate {

    public String addressNumber;
    public String features;
    public String type;
    public String priceperday;
    public String numberOfRooms;
    public String sleepingPlaces;
    public String space;

    public Rent(String municipality, String settlement, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email, String addressNumber, String features, String type, String priceperday, String numberOfRooms, String sleepingPlaces, String space) {
        super(municipality, settlement, microdistrict, street, description, imageUrl, youtubeUrl, virtualTour, price, phone, email);
        this.addressNumber = addressNumber;
        this.features = features;
        this.type = type;
        this.priceperday = priceperday;
        this.numberOfRooms = numberOfRooms;
        this.sleepingPlaces = sleepingPlaces;
        this.space = space;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=12");
        super.fillAd();
        setAddressNumber();
        setPricePerDay();
        setType();
        setSpace();
        setFeatures();
        setSleepingPlaces();
        setNumberOfRooms();
    }

    public void setAddressNumber() {
        driver.findElement(By.name("FHouseNum")).sendKeys(this.addressNumber);
    }

    public void setPricePerDay() {
        driver.findElement(By.id("priceField")).sendKeys(this.priceperday);
    }

    public void setType() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[12]/div/div[3]")).click();
    }

    public void setSpace() {
        driver.findElement(By.xpath("//*[@id=\"fieldFAreaOverAll\"]")).sendKeys(this.space);
    }

    public void setFeatures() {
        driver.findElement(By.id("showMoreFields")).click();
        String[] features = this.features.replace(", ", ",").split(",");
        for (int i = 0; i < features.length; i++) {

            switch (features[i]) {
                case "Pirtis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[1]/label/span")).click();
                    break;
                case "Baseinas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[2]/label/span")).click();
                    break;
                case "Kubilas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[3]/label/span")).click();
                    break;
                case "Maitinimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[4]/label/span")).click();
                    break;
                case "Vandens telkinys":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[5]/label/span")).click();
                    break;
                case "Sporto aikštelės":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[6]/label/span")).click();
                    break;
                case "Papildoma technika":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[7]/label/span")).click();
                    break;
                case "Geras susisiekimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[8]/label/span")).click();
                    break;
                case "Konferencijų salė":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[9]/label/span")).click();
                    break;
                case "Galima su gyvūnais":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[10]/label/span")).click();
                    break;
            }
        }
    }

    public void setSleepingPlaces() {
        driver.findElement(By.name("FBedroomsNum")).sendKeys(this.sleepingPlaces);
    }

    public void setNumberOfRooms() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[4]/div[2]")).click();
    }
}










































