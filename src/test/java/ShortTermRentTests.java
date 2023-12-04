import lt.aruodas.Helper;
import lt.aruodas.Models.RealEstate;
import lt.aruodas.Models.Rent;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShortTermRentTests {

    public static WebDriver driver;

    @Test
    public void shortTermRentPositiveTest() {
        Rent rent = new Rent("Kaunas", "Kauno m.", "Šilainiai", "9-ojo forto", "Nuomoju sodybą su patogumais", "sodyba.jpg", "https://www.youtube.com/watch?v=3J-ihriMogw", "https://sketchfab.com/3d-models/hornbek-homestead-6cd90ea07ed74242aad03edd107b49e3", "", "65214726", "sacebi1448@marksia.com", "7", "Pirtis, Baseinas, Kubilas, Vandens telkinys, Geras susisiekimas, Galima su gyvūnais", "Sodybos", "75", "4", "8", "300");
        rent.fillAd();
        Assert.assertEquals("", "");
    }

    @BeforeClass
    public void beforeClass() {
        Helper.driverInit();
        driver = RealEstate.driver;
    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
    }


}
