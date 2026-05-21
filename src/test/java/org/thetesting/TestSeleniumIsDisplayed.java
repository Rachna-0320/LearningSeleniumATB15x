package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumIsDisplayed {

        @Test
        public void verifyElementDisplayed() {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://app.vwo.com");

            WebElement loginButton =
                    driver.findElement(By.id("js-login-btn"));

            // Validation
            Assert.assertTrue(loginButton.isDisplayed());

            System.out.println("Login button is displayed!");

            driver.quit();
        }
    }
