package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By searchBox = By.id("search_query_top");
    By searchButton = By.name("submit_search");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }
}
