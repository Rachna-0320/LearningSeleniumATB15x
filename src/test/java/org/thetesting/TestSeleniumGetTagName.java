package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumGetTagName {

        @Test
        public void verifyTagName() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com");
            WebElement loginButton = driver.findElement(By.id("js-login-btn"));

            // Get Tag Name
            String tagName = loginButton.getTagName();
            System.out.println("Tag Name: " + tagName);

            // Validation
            Assert.assertEquals(tagName, "button");
            driver.quit();
        }
    }


