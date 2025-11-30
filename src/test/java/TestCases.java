import Pages.Login;
import Pages.SearchBook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCases extends BaseTest {

    WebDriverWait wait;
    String username = "@iftyqa02";
    String password = "Pass@123";

    @Test
    public void testLogin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Login login = new Login(driver);
        login.setLogin(username, password);

        String ActualNameOfTheUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName-value"))).getText();
        Assert.assertEquals(ActualNameOfTheUser, "@iftyqa02");
    }

    String bookName = "Git Pocket Guide";
    @Test
    public void testSearchBook() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        SearchBook searchBook = new SearchBook(driver);
        searchBook.searchBook(bookName);

        String actualSearchedBook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()" +
                "='"+ bookName + "']"))).getText();

        Assert.assertEquals(actualSearchedBook, bookName);
    }
}
