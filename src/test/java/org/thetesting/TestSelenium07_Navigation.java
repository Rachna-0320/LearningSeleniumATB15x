package org.thetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Navigation {

    @Test
    public void testNavigation() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://google.com");
        System.out.println("Opened Google");
        Thread.sleep(2000);

        // Navigate to Bing
        driver.navigate().to("https://bing.com");
        System.out.println("Navigated to Bing");
        Thread.sleep(2000);

        // Back
        driver.navigate().back();
        System.out.println("Navigated Back");
        Thread.sleep(2000);

        // Refresh
        driver.navigate().refresh();
        System.out.println("Page Refreshed");
        Thread.sleep(2000);

        // Forward
        driver.navigate().forward();
        System.out.println("Navigated Forward");
        driver.quit();

    }
}

