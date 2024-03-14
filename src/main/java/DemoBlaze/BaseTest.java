package DemoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseTest {
    protected static WebDriver driver;
    protected static void initializeWebDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();  // maximize window size
    }
    protected static void tearDown() {
        if(driver != null){
            driver.quit();
        }
        else{
            System.out.println("No Driver found.");
        }
    }
}
