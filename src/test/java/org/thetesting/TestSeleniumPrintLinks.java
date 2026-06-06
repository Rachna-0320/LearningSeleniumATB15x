package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

    public class TestSeleniumPrintLinks {
        @Test
        public void verifyAndPrintLinks() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total Links: " + links.size());

            for (WebElement link : links) {
                System.out.println(link.getText());
            }

            Assert.assertTrue(links.size() > 0);
            driver.quit();
        }
    }



