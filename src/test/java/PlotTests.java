import lt.aruodas.Helper;
import lt.aruodas.Models.Plot;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlotTests {

    public static WebDriver driver;

    @Test
    public void aruodasPlotPositiveTest() { //"Kaunas", "", "Šilainiai", "9-ojo Forto", "10", "Parduodu sklypą", "nameliumbas.jpg", "https://www.youtube.com/watch?v=9xkxT2hY634&pp=ygUTbHV4dXJ5IGhvdXNlIHJldmlldw%3D%3D", "https://howner.lt/", "24500", "65214726", "sacebi1448@marksia.com", "25", "7845-5236-7710", "Daugiabučių statyba"
        Plot plot = new Plot("Kaunas", "", "Šilainiai", "9-ojo Forto", "Parduodu sklypą", "nameliumbas.jpg", "https://www.youtube.com/watch?v=9xkxT2hY634&pp=ygUTbHV4dXJ5IGhvdXNlIHJldmlldw%3D%3D", "https://howner.lt/", "24500", "65214726", "sacebi1448@marksia.com", "25", "7845-5236-7710", "Daugiabučių statyba", "1000");
        plot.fillAd();
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
