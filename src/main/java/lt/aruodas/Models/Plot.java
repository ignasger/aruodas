package lt.aruodas.Models;

import org.openqa.selenium.By;

public class Plot extends RealEstate {

    public String addressNumber;
    public String rcNumber;
    public String purposes;
    public String spaces;

    public Plot(String municipality, String settlement, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email, String addressNumber, String rcNumber, String purposes, String spaces) {
        super(municipality, settlement, microdistrict, street, description, imageUrl, youtubeUrl, virtualTour, price, phone, email);
        this.addressNumber = addressNumber;
        this.rcNumber = rcNumber;
        this.purposes = purposes;
        this.spaces = spaces;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        super.fillAd();
        setAddressNumber();
        setRcNumber();
        setPurposes();
        setSpaces();
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

    public void setPurposes() {
        String[] purposes = this.purposes.split(",");
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










































