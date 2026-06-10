package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

    public class TestSauceDemoProducts {

        @Test
        public void verifyProductsCount() {

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

            // Get all products
            List<WebElement> products =
                    driver.findElements(By.className("inventory_item"));

            System.out.println("Total Products: " + products.size());

            // Validation
            Assert.assertEquals(products.size(), 6);

            driver.quit();
        }
    }
