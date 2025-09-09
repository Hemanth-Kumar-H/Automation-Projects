package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By proceedToCheckout = By.cssSelector("a[title='Proceed to checkout']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout() {
        driver.findElement(proceedToCheckout).click();
    }
}
