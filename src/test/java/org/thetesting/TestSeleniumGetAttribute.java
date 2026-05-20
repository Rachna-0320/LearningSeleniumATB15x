package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumGetAttribute {
        @Test
        public void verifyPlaceholderText() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com");

            WebElement emailInput = driver.findElement(By.id("login-username"));

            // Get placeholder attribute
            String placeholder =
                    emailInput.getAttribute("placeholder");
            System.out.println(placeholder);

            // Validation
            Assert.assertEquals(placeholder, "name@yourcompany.com");

            driver.quit();
        }
    }

