import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubCategoryPageLogic {

    By firstProductPromotion = By.xpath("//span[contains(@class, 'promo-label_type_action')]/..");

    private WebDriver driver;
    private WebDriverWait wait;

    public SubCategoryPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public ProductPageLogic clickProductPage() {
        driver.findElement(firstProductPromotion).click();
        return new ProductPageLogic(driver, wait);
    }


}
