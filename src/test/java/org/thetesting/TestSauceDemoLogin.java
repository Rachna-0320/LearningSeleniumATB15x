package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSauceDemoLogin {
    @Test
    public void verifySuccessfulLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click login button
        driver.findElement(By.id("login-button"))
                .click();

        // Verify Products page
        String pageTitle = driver.findElement(By.className("title")).getText();
        System.out.println("Page Title: " + pageTitle);

        Assert.assertEquals(pageTitle, "Products");
        driver.quit();
    }
}



