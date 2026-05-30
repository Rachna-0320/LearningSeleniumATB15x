package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTheInternet {

    @Test
    public void verifyCheckboxPage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement heading = driver.findElement(By.tagName("h3"));
        String actualText = heading.getText();
        System.out.println(actualText);

        Assert.assertEquals(actualText, "Checkboxes");
        driver.quit();
    }
}



