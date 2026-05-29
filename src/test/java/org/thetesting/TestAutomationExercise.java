package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomationExercise {

    @Test
    public void verifySignupButtonDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        WebElement signupLoginButton = driver.findElement(By.linkText("Signup / Login"));

        // Validation
        Assert.assertTrue(signupLoginButton.isDisplayed());
        System.out.println("Signup/Login button is displayed!");

        driver.quit();
    }
}

