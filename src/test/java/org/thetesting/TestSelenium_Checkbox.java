package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSelenium_Checkbox {
        @Test
        public void verifyCheckboxSelection() {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/checkboxes");

            WebElement checkbox1 = driver.findElement(By.cssSelector("input[type='checkbox']"));

            // Select checkbox
            checkbox1.click();

            // Validation
            Assert.assertTrue(checkbox1.isSelected());
            System.out.println("Checkbox selected successfully!");

            driver.quit();
        }
    }




