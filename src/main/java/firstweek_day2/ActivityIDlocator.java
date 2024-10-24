package firstweek_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityIDlocator {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        By userNameLocator = By.id("email");
        WebElement userNameElement = driver.findElement(userNameLocator);
        userNameElement.sendKeys("hashmat@gmail.com");

        By passwordLocator = By.id("pass");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("wrongpassword");

        By btnLocator = By.name("login");
        WebElement btnElement = driver.findElement(btnLocator);
        btnElement.click();

        Thread.sleep(20000);

        driver.quit();
    }
}
