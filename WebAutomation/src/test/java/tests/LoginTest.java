package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.LoginPage;
import utils.ConfigReader;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get(ConfigReader.getBaseURL());
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(driver);
        login.login(ConfigReader.getUsername(), ConfigReader.getPassword());
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
