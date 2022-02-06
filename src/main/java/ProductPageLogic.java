import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPageLogic {

    By promoOnTheCard = By.xpath("//app-label[contains(@class,'main-gallery__label')]");

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean checkPromoOnCard() {
        return driver.findElement(promoOnTheCard).isDisplayed();
    }

}
