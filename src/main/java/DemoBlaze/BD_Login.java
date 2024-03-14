package DemoBlaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
public class BD_Login extends BaseTest {
    private static final String baseUrl = "https://demoblaze.com/index.html";

    // Explicit wait
    //static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private static final String newEmail = Common.randomEmail();

    @Test
    public void LoginTest() throws IOException {
        initializeWebDriver();
        userLogin();
    }
    public static void userLogin() throws IOException {
        driver.get(baseUrl);

        WebElement loginMenu = driver.findElement(By.linkText("Log in"));
        loginMenu.click();

        // wait for the modal to appear
        WebElement loginModal = driver.findElement(By.id("logInModal"));

        // inside modal, locate username and password
        WebElement usernameInput = loginModal.findElement(By.id("loginusername"));
        usernameInput.clear();
        usernameInput.sendKeys(Common.getTextFromFile("src/main/java/DemoBlaze/users.txt"));

        WebElement passwordInput = loginModal.findElement(By.id("loginpassword"));
        passwordInput.clear();
        passwordInput.sendKeys("1234567");

        WebElement loginButton = loginModal.findElement(By.cssSelector("body [tabindex='-1']:nth-of-type(3) .btn-primary"));
        loginButton.click();



    }


}
