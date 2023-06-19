package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - Project Name: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class SauceDemo {
    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open the URL into browser
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        System.out.println("Page title is:" + driver.getTitle());

        //Get the current url
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the username in username field
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("ashish123@gmail.com");

        //Enter the password in password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("ashish123");

        //Close the browser
        driver.close();

    }
}
