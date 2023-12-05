import lt.aruodas.Helper;
import lt.aruodas.Models.House;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HouseForSaleTests {

    public static WebDriver driver;

    @Test
    public void houseForSellPositiveTest() {
        House house = new House("Kaunas", "Kauno m.", "Šilainiai", "9-ojo forto", "Parduodamas namas gražioje vietoje. Su garažu, netoli ežero", "namelis.jpeg", "https://www.youtube.com/watch?v=gvBSbrwnO5Y", "https://www.sothebysrealty.com/eng/sales/detail/180-l-122365-5phjbb/459-elk-ridge-road-telluride-co-81435", "950000", "65214647", "sacebi1448@marksia.com", "5", "", "Namas (gyvenamasis)", "230", "2021", "70", "Mūrinis", "Įrengtas", "Dujinis, Saulės energija", "585214536651", "4", "Ežeras", "200", "Miesto vandentiekis", "kraštinis sklypas, greta miško, asfaltuotas privažiavimas, elektra, internetas, dujos, kabelinė televizija", "garažas, pirtis, terasa", "kondicionierius, su baldais, šildomos grindys, rekuperacinė sistema, virtuvės komplektas, indaplovė, židinys", "aptverta teritorija, signalizacija, vaizdo kameros, šarvuotos durys", "A++", "2");
        house.fillAd();
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
