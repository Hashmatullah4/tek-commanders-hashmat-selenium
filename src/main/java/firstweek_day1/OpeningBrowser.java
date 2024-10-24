package firstweek_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.quit();
    }
}
