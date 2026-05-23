package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumClear {
        @Test
        public void verifyClearMethod() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com");
            WebElement emailInput = driver.findElement(By.id("login-username"));

            // Enter text
            emailInput.sendKeys("admin@admin.com");

            // Clear text
            emailInput.clear();

            // Validation
            Assert.assertEquals(
                    emailInput.getAttribute("value"), "");
            System.out.println("Input field cleared successfully!");

            driver.quit();
        }
    }


