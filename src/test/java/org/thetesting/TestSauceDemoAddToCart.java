package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSauceDemoAddToCart {
        @Test
        public void verifyAddToCart() {
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

            // Add first product to cart
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                    .click();

            // Verify cart badge count
            String cartCount = driver.findElement(By.className("shopping_cart_badge"))
                    .getText();
            System.out.println("Cart Count: " + cartCount);

            Assert.assertEquals(cartCount, "1");
            driver.quit();
        }
    }

