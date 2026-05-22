package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumIsEnabled {

        @Test
        public void verifyButtonEnabled() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com");
            WebElement loginButton = driver.findElement(By.id("js-login-btn"));

            // Validation
            Assert.assertTrue(loginButton.isEnabled());
            System.out.println("Login button is enabled!");

            driver.quit();
        }
    }

