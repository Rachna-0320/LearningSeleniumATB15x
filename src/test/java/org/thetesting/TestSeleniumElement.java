package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumElement {

    @Test
    public void testAppVWO() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement userEmailId = driver.findElement(By.id("login-username"));
        userEmailId.sendKeys("admin@admin.com");

        WebElement userPassword = driver.findElement(By.name("password"));
        userPassword.sendKeys("wrongPassword@123");

        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();

        Thread.sleep(5000);

        WebElement errorMessage = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(errorMessage.getText());

        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
    }
}

