package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumRadioButton {
        @Test
        public void verifyRadioButton() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/radio-button");

            WebElement yesRadio = driver.findElement(By.cssSelector("label[for='yesRadio']"));

            // Click radio button
            yesRadio.click();

            // Validation
            WebElement successMessage =
                    driver.findElement(By.className("text-success"));

            Assert.assertEquals(successMessage.getText(), "Yes");
            System.out.println("Radio button selected successfully!");
            driver.quit();
        }
    }



