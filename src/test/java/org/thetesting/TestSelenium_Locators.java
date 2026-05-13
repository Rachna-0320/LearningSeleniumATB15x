package org.thetesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Locators {
    @Test
    public void testLocators() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        // ID Locator
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");

        // NAME Locator
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // XPATH Locator
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        System.out.println("Login attempted successfully!");
        driver.quit();
    }
}



