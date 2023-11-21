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
    public void aruodasPlotPositiveTest(){
        Plot plot = new Plot

    plot.fillAd();
    Assert.assertEquals("","");
    }

    @BeforeClass
    public void beforeClass(){
        helper.driverInit();
        driver = RealEstate.driver;
    }

    @AfterClass
    public void afterClass(){
        //driver.quit();
    }
















}
