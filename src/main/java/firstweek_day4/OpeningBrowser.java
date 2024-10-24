package firstweek_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpeningBrowser {

    public static void main(String[] args) {
        ChromeDriver driverChrome = new ChromeDriver();
        SafariDriver driverSafari = new SafariDriver();

        driverChrome.get("https://dev.retail.tekschool-students.com");
        String text = driverChrome.getTitle();

        System.out.println(text);

        driverSafari.get("https://dev.retail.tekschool-students.com");
        String textSafari = driverSafari.getTitle();

        System.out.println(textSafari);


        driverChrome.quit();
        driverSafari.quit();

    }
}
