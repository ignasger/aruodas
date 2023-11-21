package lt.aruodas.Models;

public class Plot extends RealEstate {

    public String addressNumber;
    public String rcNumber;
    public String purposes;

    public RealEstate(String municipality, String village, String microdistrict, String street, String description, String imageUrl, String youtubeUrl, String virtualTour, String price, String phone, String email) {
        this.municipality = municipality;
        this.village = village;
        this.microdistrict = microdistrict;
        this.street = street;
        this.description = description;
        this.imageUrl = imageUrl;
        this.youtubeUrl = youtubeUrl;
        this.virtualTour = virtualTour;
        this.price = price;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public void fillAd() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        super.fillAd();
        setAddressNumber();
        setRcNumber();
        setPurposes();
    }












































}
