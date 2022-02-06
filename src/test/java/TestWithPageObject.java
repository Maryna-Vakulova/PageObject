import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestWithPageObject {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void testPromoOnCardWithPageObject() {

        new MainPageLogic(driver, wait).clickCategoryBtn();
        new CategoryPageLogic(driver, wait).clickSubCategoryBtn();
        new FiltersLogic(driver, wait).chooseSeller().chooseMaxPrice("100000").clickSubmitBtn();
        new SubCategoryPageLogic(driver, wait).clickProductPage();

        Assert.assertTrue(new ProductPageLogic(driver, wait).checkPromoOnCard());

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }


}
