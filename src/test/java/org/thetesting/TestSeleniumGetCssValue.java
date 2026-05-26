package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumGetCssValue {

        @Test
        public void verifyButtonColor() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com");
            WebElement loginButton = driver.findElement(By.id("js-login-btn"));

            // Get CSS Value
            String buttonColor = loginButton.getCssValue("background-color");
            System.out.println(buttonColor);

            // Validation
            Assert.assertNotNull(buttonColor);

            driver.quit();
        }
    }



