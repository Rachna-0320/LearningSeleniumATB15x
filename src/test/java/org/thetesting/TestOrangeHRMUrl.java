package org.thetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestOrangeHRMUrl {

        @Test
        public void verifyOrangeHRMUrl() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Capture current URL
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL: " + currentUrl);

            // Validation
            Assert.assertTrue(currentUrl.contains("orangehrm"));
            driver.quit();
        }
    }




