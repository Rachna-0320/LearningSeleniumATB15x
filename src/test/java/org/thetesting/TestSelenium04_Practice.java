package org.thetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium04_Practice {

    @Test
            public void testDemoApp() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");

        String  actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, "CURA Healthcare Service");
       driver.quit();
    }

}
