package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumGetText {

        @Test
        public void verifyTextMessage() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");

            WebElement heading = driver.findElement(By.tagName("h2"));
            System.out.println(heading.getText());

            // Validation
            Assert.assertEquals(heading.getText(), "Login Page");

            driver.quit();
        }
    }

