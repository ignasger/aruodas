package lt.aruodas.Models;

import org.openqa.selenium.By;

public class House extends RealEstate {

    public String addressNumber;
    public String features;
    public String houseType;
    public String spaceM2;
    public String constructionYear;
    public String plotSpaceA;
    public String buildingType;
    public String installation;
    public String heating;
    public String rcNumber;

    public House(String municipality, String settlement, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email, String addressNumber, String features, String houseType, String spaceM2, String constructionYear, String plotSpaceA, String buildingType, String installation, String heating, String rcNumber) {
        super(municipality, settlement, microdistrict, street, description, imageUrl, youtubeUrl, virtualTour, price, phone, email);
        this.addressNumber = addressNumber;
        this.features = features;
        this.houseType = houseType;
        this.spaceM2 = spaceM2;
        this.constructionYear = constructionYear;
        this.plotSpaceA = plotSpaceA;
        this.buildingType = buildingType;
        this.installation = installation;
        this.heating = heating;
        this.rcNumber = rcNumber;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=2");
        super.fillAd();
    }

}










































