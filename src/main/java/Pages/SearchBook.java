package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchBook extends BasePage{
    public SearchBook(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "searchBox")
    WebElement BookSearchBox;

    public void searchBook(String bookName) {
        wait.until(ExpectedConditions.visibilityOf(BookSearchBox)).sendKeys(bookName);
    }
}
