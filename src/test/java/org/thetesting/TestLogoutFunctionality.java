package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogoutFunctionality {
    @Test
    public void verifyLogout() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        // Login
        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        // Click Logout
        driver.findElement(By.cssSelector("a.button.secondary.radius"))
                .click();

        // Verify user is back on login page
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
        System.out.println("Logout Successful!");
        driver.quit();
    }
}

