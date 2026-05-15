package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumLocators2 {

    @Test
    public void testLoginVWO(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        // Locate element using partialLinkText
        WebElement trailLink = driver.findElement(By.partialLinkText("TRIAL"));
        trailLink.click();

        // Validation
        Assert.assertEquals(trailLink.getText(), "Start a FREE TRIAL");

        driver.quit();
    }
}


