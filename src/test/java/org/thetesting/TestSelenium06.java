package org.thetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium06 {
   @Test
    public void test_01(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

       // TestNG Assertion
        Assert.assertEquals(driver.getTitle(), "Google");

       // AssertJ Assertion
       assertThat(driver.getTitle())
               .isNotBlank()
               .isNotEmpty()
               .isNotNull()
               .isEqualTo("Google") ;
        driver.quit();
    }
}
