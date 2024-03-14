package DemoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitBaseTest {
    protected static WebDriver driver;

    protected static void initializeWebDriver() {
        driver = new ChromeDriver();
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
