package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.CartPage;
import utils.ConfigReader;

public class CheckoutTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get(ConfigReader.getBaseURL());
        driver.manage().window().maximize();
    }

    @Test
    public void checkoutTest() throws InterruptedException {
        CartPage cart = new CartPage(driver);
        Thread.sleep(2000);
        cart.checkout();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
