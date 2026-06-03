package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestSeleniumDropdown {
        @Test
        public void verifyDropdownSelection() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/dropdown");
            WebElement dropdownElement = driver.findElement(By.id("dropdown"));

            Select dropdown = new Select(dropdownElement);
            dropdown.selectByVisibleText("Option 1");
            String selectedOption = dropdown.getFirstSelectedOption().getText();
            System.out.println("Selected Option: " + selectedOption);

            Assert.assertEquals(selectedOption, "Option 1");
            driver.quit();
        }
    }


