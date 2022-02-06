import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FiltersLogic {

    By filterSellerRozetka = By.xpath("//a[@data-id='Rozetka']");
    By filterMaxPrice = By.xpath("//input[@formcontrolname='max']");
    By buttonSubmitFilter = By.xpath("//input[@formcontrolname='max']/../button");

    private WebDriver driver;
    private WebDriverWait wait;

    public FiltersLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public FiltersLogic chooseSeller() {
        driver.findElement(filterSellerRozetka).click();
        return this;
    }

    public FiltersLogic chooseMaxPrice(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(filterMaxPrice)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(filterMaxPrice)).sendKeys(text);
        return this;
    }

    public FiltersLogic clickSubmitBtn() {
        driver.findElement(buttonSubmitFilter).click();
        return this;
    }


}
