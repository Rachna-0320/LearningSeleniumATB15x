package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumLogin {
        @Test
        public void verifyInvalidLogin() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");

            // Enter Username
            driver.findElement(By.id("username"))
                    .sendKeys("wrongUser");

            // Enter Password
            driver.findElement(By.id("password"))
                    .sendKeys("wrongPassword");

            // Click Login Button
            driver.findElement(By.cssSelector("button[type='submit']"))
                    .click();

            // Get Error Message
            String errorMessage = driver.findElement(By.id("flash"))
                    .getText();
            System.out.println(errorMessage);

            // Validation
            Assert.assertTrue(errorMessage.contains("Your username is invalid!"));
            driver.quit();
        }
    }

