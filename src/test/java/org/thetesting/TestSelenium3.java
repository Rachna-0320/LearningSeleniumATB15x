package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium3 {
    @Test
    public void testAppVWO_ErrorVerify() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vwo.com/free-trial/");
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("ABC");

        WebElement checkBox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkBox.click();

        WebElement buttonCreateAccount = driver.findElement(By.tagName("button"));
        buttonCreateAccount.click();

        WebElement errorMessage = driver.findElement(By.className("invalid-reason"));
       Assert.assertEquals(errorMessage.getText(), "The email address you entered is incorrect.");
        driver.quit();
    }
}




