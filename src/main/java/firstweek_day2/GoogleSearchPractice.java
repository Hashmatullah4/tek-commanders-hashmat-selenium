package firstweek_day2;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class GoogleSearchPractice {

    public static void main(String[] args) throws InterruptedException {

        SafariDriver driver = new SafariDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        By searchBarLocator = By.name("q");
        WebElement searchBarElement = driver.findElement(searchBarLocator);
        searchBarElement.sendKeys("UC Davis");

        Thread.sleep(1000);

        By searchBtnLocator = By.name("btnK");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();


        Thread.sleep(2000);

        driver.quit();

        // remained uncomplete.
    }
}
