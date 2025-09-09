package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.ProductPage;
import utils.ConfigReader;

public class SearchAndAddToCartTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get(ConfigReader.getBaseURL());
        driver.manage().window().maximize();
    }

    @Test
    public void searchAndAddToCart() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.searchProduct("dress");

        ProductPage product = new ProductPage(driver);
        Thread.sleep(2000); // Wait for product page to load
        product.addToCart();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
