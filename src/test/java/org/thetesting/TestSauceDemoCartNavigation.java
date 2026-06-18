package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSauceDemoCartNavigation {
    @Test
    public void verifyCartNavigation() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        // Open Cart
        driver.findElement(By.className("shopping_cart_link"))
                .click();

        // Verify Cart Page Title
        String cartTitle =
                driver.findElement(By.className("title")).getText();

        System.out.println("Page Title: " + cartTitle);
        Assert.assertEquals(cartTitle, "Your Cart");
        driver.quit();
    }
}


