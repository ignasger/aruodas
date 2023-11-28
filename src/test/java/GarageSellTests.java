import lt.aruodas.Helper;
import lt.aruodas.Models.Garage;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GarageSellTests {

    public static WebDriver driver;

    @Test
    public void garageSellPositiveTest() {
        Garage garage = new Garage("Kaunas", "Kauno m.", "Šilainiai", "9-ojo forto", "Parduodamas garažas pigiai nebrangiai su visais patogumais", "garazas.jpg", "https://www.youtube.com/watch?v=8LZV640Ndyw&pp=ygUGZ2FyYWdl", "https://www.garageliving.com/3d-virtual-tours", "23200", "65214726", "sacebi1448@marksia.com", "25", "7845-5236-7710", "35", "Apsauga, Šildymas, Automatiniai vartai, Domina keitimas", "Pardavimui", "Mūrinis", "3");
        garage.fillAd();
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
