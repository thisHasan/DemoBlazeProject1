package DemoBlaze;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BD_Order extends BaseTest {
    private static final String baseUrl = "https://www.demoblaze.com/index.html";

    //div#tbodyid > div:nth-of-type(1) .hrefch

    @Test
    public void orderProductTest() {
        initializeWebDriver();

        orderProduct();

    }

    public static void orderProduct(){

        driver.get(baseUrl);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement samsungGalaxyS6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung galaxy s6")));


        samsungGalaxyS6.click();

        WebElement samsungGalaxyS6AddToCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-success")));

        //WebElement samsungGalaxyS6AddToCart = driver.findElement(By.cssSelector(".btn-success"));
        samsungGalaxyS6AddToCart.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait2.until(ExpectedConditions.alertIsPresent());

        //((Alert) alert).accept();
        driver.switchTo().alert().accept();

        WebElement cartInMenu = driver.findElement(By.cssSelector("#cartur"));
        cartInMenu.click();


        WebElement placeOrderButton = driver.findElement(By.cssSelector("[class='col-lg-1'] [data-toggle]"));
        placeOrderButton.click();

        // wait for the modal to appear
        WebElement signupModal = driver.findElement(By.id("orderModalLabel"));

        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        //WebElement nameInput = signupModal.findElement(By.id("name"));
        nameInput.clear();
        nameInput.sendKeys("Bob");

        WebElement countryInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
        //WebElement countryInput = signupModal.findElement(By.id("country"));
        countryInput.clear();
        countryInput.sendKeys("Bangladesh");

        WebElement cityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
        //WebElement cityInput = signupModal.findElement(By.id("city"));
        cityInput.clear();
        cityInput.sendKeys("Bangladesh");

        WebElement creditcardInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("card")));
        //WebElement creditcardInput = signupModal.findElement(By.id("card"));
        creditcardInput.clear();
        creditcardInput.sendKeys("999");

        WebElement monthInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
        //WebElement monthInput = signupModal.findElement(By.id("month"));
        monthInput.clear();
        monthInput.sendKeys("March");

        WebElement yearInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        //WebElement yearInput = signupModal.findElement(By.id("year"));
        yearInput.clear();
        yearInput.sendKeys("2024");

        WebElement purchaseButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body [tabindex='-1']:nth-of-type(3) .btn-primary")));

        //WebElement purchaseButton = signupModal.findElement(By.cssSelector("body [tabindex='-1']:nth-of-type(3) .btn-primary"));
        purchaseButton.click();

        //Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());

        //((Alert) alert).accept();
        //driver.switchTo().alert().accept();
        WebElement finalOKButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" [tabindex='1']")));










    }


}
