package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumCheckbox {

        @Test
        public void verifyCheckboxSelection() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/checkboxes");

            WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
            checkbox.click();

            Assert.assertTrue(checkbox.isSelected());
            System.out.println("Checkbox selected successfully!");
            driver.quit();
        }
    }

