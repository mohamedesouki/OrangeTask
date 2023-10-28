package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openUrl() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(" https://www.amazon.eg/");

    }


    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

    }
}