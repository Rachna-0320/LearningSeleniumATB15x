package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSauceDemoProductPrice {
    @Test
    public void verifyProductPrice() {
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

        // Get first product price
        WebElement productPrice =
                driver.findElement(By.className("inventory_item_price"));

        String actualPrice = productPrice.getText();

        System.out.println("Product Price: " + actualPrice);

        // Validation
        Assert.assertEquals(actualPrice, "$29.99");
        driver.quit();
    }
}
