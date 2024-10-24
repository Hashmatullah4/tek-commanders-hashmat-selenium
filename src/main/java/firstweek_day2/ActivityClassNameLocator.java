package firstweek_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityClassNameLocator {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By signInLocator = By.className("top-nav__btn");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By titleLocator = By.className("login__title");
        WebElement titleElement = driver.findElement(titleLocator);
        String titleText = titleElement.getText();

        Thread.sleep(1000);

        System.out.println(titleText);

        driver.quit();
    }
}
