import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Koel {
    @Test
    public void koelLogin() throws InterruptedException {
        System.setProperty("web.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bbb.testpro.io");

        By usernameFieldLocator = By.xpath("//*[@type='email']");
        WebElement usernameField = driver.findElement(usernameFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        usernameField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");

        loginButton.click();

        Thread.sleep(5000); //option like implicit wait
        By homeLocator = By.className("home");
        WebElement home = driver.findElement(homeLocator);
        Assert.assertTrue(home.isDisplayed());

        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void koelLoginIncorrectassword() throws InterruptedException {
        System.setProperty("web.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bbb.testpro.io");

        By usernameFieldLocator = By.xpath("//*[@type='email']");
        WebElement usernameField = driver.findElement(usernameFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        usernameField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("wrongPassword");

        loginButton.click();

        Thread.sleep(5000); //option like implicit wait
        By errorLocator = By.className("home");
        WebElement error = driver.findElement(errorLocator);
        Assert.assertTrue(error.isDisplayed());

        Thread.sleep(3000);
        driver.quit();

    }

}
