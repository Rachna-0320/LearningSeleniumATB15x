package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInvalidLogin {
    @Test
    public void verifyInvalidLoginErrorMessage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        // Enter invalid username
        driver.findElement(By.id("username"))
                .sendKeys("invalidUser");

        // Enter invalid password
        driver.findElement(By.id("password"))
                .sendKeys("invalidPassword");

        // Click Login button
        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        // Capture error message
        String errorMessage = driver.findElement(By.id("flash"))
                .getText();

        System.out.println(errorMessage);

        // Validation
        Assert.assertTrue(errorMessage.contains("Your username is invalid!"));
        driver.quit();
    }
}


