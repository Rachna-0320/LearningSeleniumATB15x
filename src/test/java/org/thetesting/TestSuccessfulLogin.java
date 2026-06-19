package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuccessfulLogin {
    @Test
    public void verifySuccessfulLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        // Enter valid credentials
        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        // Click Login
        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        // Verify success message
        String message = driver.findElement(By.id("flash"))
                .getText();

        System.out.println(message);
        Assert.assertTrue(message.contains("You logged into a secure area!"));
        driver.quit();
    }
}