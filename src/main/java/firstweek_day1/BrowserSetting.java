package firstweek_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetting {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String pageTitle = driver.getTitle();

        System.out.println(pageTitle);

        driver.quit();
    }
}
