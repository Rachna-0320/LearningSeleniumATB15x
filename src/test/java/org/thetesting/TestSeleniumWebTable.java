package org.thetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

    public class TestSeleniumWebTable {
        @Test
        public void verifyTableRows() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/tables");

            List<WebElement> rows = driver.findElements(By.cssSelector("#table1 tbody tr"));
            System.out.println("Total Rows: " + rows.size());

            for (WebElement row : rows) {
                System.out.println(row.getText());
            }

            Assert.assertTrue(rows.size() > 0);
            driver.quit();
        }
    }


