package lt.aruodas.Models;

import org.openqa.selenium.By;

public class House extends RealEstate {

    public String houseNumber;
    public String clickFeatures;
    public String houseType;
    public String spaceM2;
    public String constructionYear;
    public String plotSpaceA;
    public String buildingType;
    public String installation;
    public String heating;
    public String rcNumber;
    public String numberOfRooms;
    public String bodyOfWater;
    public String toBodyOfWater;
    public String waterFeatures;
    public String features;
    public String additionalPremises;
    public String additionalInstallation;
    public String security;
    public String energyClass;
    public String numberOfFloors;

    public House(String municipality, String settlement, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email, String houseNumber, String clickFeatures, String houseType, String spaceM2, String constructionYear, String plotSpaceA, String buildingType, String installation, String heating, String rcNumber, String numberOfRooms, String bodyOfWater, String toBodyOfWater, String waterFeatures, String features, String additionalPremises, String additionalInstallation, String security, String energyClass, String numberOfFloors) {
        super(municipality, settlement, microdistrict, street, description, imageUrl, youtubeUrl, virtualTour, price, phone, email);
        this.houseNumber = houseNumber;
        this.clickFeatures = clickFeatures;
        this.houseType = houseType;
        this.spaceM2 = spaceM2;
        this.constructionYear = constructionYear;
        this.plotSpaceA = plotSpaceA;
        this.buildingType = buildingType;
        this.installation = installation;
        this.heating = heating;
        this.rcNumber = rcNumber;
        this.numberOfRooms = numberOfRooms;
        this.bodyOfWater = bodyOfWater;
        this.toBodyOfWater = toBodyOfWater;
        this.waterFeatures = waterFeatures;
        this.features = features;
        this.additionalPremises = additionalPremises;
        this.additionalInstallation = additionalInstallation;
        this.security = security;
        this.energyClass = energyClass;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=2");
        super.fillAd();
        setHouseNumber();
        setRcNumber();
        setSpaceM2();
        setNumberOfFloors();
        setPlotSpaceA();
        setConstructionYear();
        setHouseType();
        setBuildingType();
        setInstallation();
        setHeating();
        setClickFeatures();
        setNumberOfRooms();
        setBodyofWater();
        setToBodyOfWater();
        setWaterFeaturas();
    }

    public void setHouseNumber() {
        driver.findElement(By.name("FHouseNum")).sendKeys(this.houseNumber);
    }

    public void setRcNumber() {
        driver.findElement(By.name("RCNumber")).sendKeys(this.rcNumber);
    }

    public void setSpaceM2() {
        driver.findElement(By.xpath("//*[@id=\"fieldFAreaOverAll\"]")).sendKeys(this.spaceM2);
    }

    public void setNumberOfFloors() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[14]/div/div[2]/div[2]")).click();
    }

    public void setPlotSpaceA() {
        driver.findElement(By.name("FAreaLot")).sendKeys(this.plotSpaceA);
    }

    public void setConstructionYear() {
        driver.findElement(By.name("FBuildYear")).sendKeys(this.constructionYear);
    }

    public void setHouseType() {

        String[] houseType = this.houseType.replace(", ", ",").split(",");
        for (int i = 0; i < houseType.length; i++) {

            switch (houseType[i]) {

                case "Namas (gyvenamasis)":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[1]/div[2]")).click();
                    break;
                case "Namo dalis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[2]/div[2]")).click();
                    break;
                case "Sodo namas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[3]/div[2]")).click();
                    break;
                case "Sublokuotas namas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[4]/div[2]")).click();
                    break;
                case "Sodyba":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[5]/div[2]")).click();
                    break;
                case "Kita (nukeliamas, projektas, kt.)":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[6]/div[2]")).click();
                    break;
            }
        }
    }

    public void setBuildingType() {

        String[] buildingType = this.buildingType.replace(", ", ",").split(",");
        for (int i = 0; i < buildingType.length; i++) {

            switch (buildingType[i]) {

                case "Mūrinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[1]/div[2]")).click();
                    break;
                case "Blokinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[2]/div[2]")).click();
                    break;
                case "Monolitinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[3]/div[2]")).click();
                    break;
                case "Medinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[4]/div[2]")).click();
                    break;
                case "Karkasinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[5]/div[2]")).click();
                    break;
                case "Rąstinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[6]/div[2]")).click();
                    break;
                case "Skydinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[7]/div[2]")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[8]/div[2]")).click();
                    break;
            }
        }
    }

    public void setInstallation() {

        String[] installation = this.installation.replace(", ", ",").split(",");
        for (int i = 0; i < installation.length; i++) {

            switch (installation[i]) {

                case "Įrengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[1]/div[2]")).click();
                    break;
                case "Dalinė apdaila":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[2]/div[2]")).click();
                    break;
                case "Neįrengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[3]/div[2]")).click();
                    break;
                case "Nebaigtas statyti":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[4]/div[2]")).click();
                    break;
                case "Pamatai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[5]/div[2]")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[6]/div[2]")).click();
                    break;
            }
        }
    }

    public void setHeating() {

        String[] heating = this.heating.replace(", ", ",").split(",");
        for (int i = 0; i < heating.length; i++) {

            switch (heating[i]) {

                case "Centrinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[1]/label/span")).click();
                    break;
                case "Elektra":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[2]/label/span")).click();
                    break;
                case "Skystu kuru":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[3]/label/span")).click();
                    break;
                case "Centrinis kolektorinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[4]/label/span")).click();
                    break;
                case "Geoterminis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[5]/label/span")).click();
                    break;
                case "Aeroterminis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[6]/label/span")).click();
                    break;
                case "Dujinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[7]/label/span")).click();
                    break;
                case "Kietu kuru":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[8]/label/span")).click();
                    break;
                case "Saulės energija":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[9]/label/span")).click();
                    break;
                case "kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[10]/label/span")).click();
                    break;

            }
        }
    }

    public void setClickFeatures() {
        driver.findElement(By.className("bigObjBtn")).click();
    }

    public void setNumberOfRooms() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[25]/div/div[4]/div[2]")).click();
    }

    public void setBodyofWater() {

        String[] bodyofWater = this.bodyOfWater.replace(", ", ",").split(",");
        for (int i = 0; i < bodyofWater.length; i++) {

            switch (bodyofWater[i]) {

                case "Ežeras":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[26]/div/div[1]/div[2]")).click();
                    break;
                case "Upė":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[26]/div/div[2]/div[2]")).click();
                    break;
                case "Tvenkinys":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[26]/div/div[3]/div[2]")).click();
                    break;
                case "Jūras":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[26]/div/div[4]/div[2]")).click();
                    break;
            }
        }
    }

    public void setToBodyOfWater() {
        driver.findElement(By.name("FWaterAccumDist")).sendKeys(this.toBodyOfWater);
    }

    public void setWaterFeaturas() {

        String[] waterFeaturas = this.waterFeatures.replace(", ", ",").split(",");
        for (int i = 0; i < waterFeaturas.length; i++) {

            switch (waterFeaturas[i]) {

                case "Artezinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[1]/label/span")).click();
                    break;
                case "Miesto vandentiekis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[2]/label/span")).click();
                    break;
                case "Šulinys":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[3]/label/span")).click();
                    break;
                case "Vietinis vandentiekis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[4]/label/span")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[5]/label/span")).click();
                    break;
            }
        }
    }
}











































