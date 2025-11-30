package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends BasePage{
    public Login(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login")
    WebElement loginButton;

    public void setLogin(String nameOfUser, String passwordOfUser) {
        {
            wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
            wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(nameOfUser);
            wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passwordOfUser);
            wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
        }
    }
}
