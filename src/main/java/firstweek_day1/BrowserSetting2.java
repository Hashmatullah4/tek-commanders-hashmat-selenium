package firstweek_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetting2 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println(title);

        driver.quit();
    }
}
