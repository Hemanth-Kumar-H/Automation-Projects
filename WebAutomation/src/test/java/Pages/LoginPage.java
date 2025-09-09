package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By email = By.id("email");
    By password = By.id("passwd");
    By submitButton = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(email).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(submitButton).click();
    }
}
