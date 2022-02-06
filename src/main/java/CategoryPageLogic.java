import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPageLogic {

    By choiceCategoryNotebook = By.xpath("//div[@class='tile-cats']");


    private WebDriver driver;
    private WebDriverWait wait;

    public CategoryPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SubCategoryPageLogic clickSubCategoryBtn() {
        driver.findElement(choiceCategoryNotebook).click();
        return new SubCategoryPageLogic(driver, wait);
    }
}
