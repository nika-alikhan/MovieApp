package testMovieApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


// Test case: User opens MovieApp in Chrome browser. Once opened, user click on "Sort" button

public class MovieApp {

    private WebDriver driver;

    @Test
    public void openMovieApp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://movieapp.com");

        Thread.sleep(2000);

        WebElement sortButton = driver.findElement(By.xpath("//*[@type='button']"));

        sortButton.click();

        Thread.sleep(2000);
        driver.quit();




    }
}
