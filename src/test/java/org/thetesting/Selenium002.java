package org.thetesting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.Driver;

public class Selenium002 {
    public static void main(String[] args) {

        // SearchContext - interface (GGF)
        // WebDriver extends from  SearchContext - interface  (GF)
        // RemoteWebDriver implements  WebDriver &  SearchContext(indirectly) - class (F)
        // ChromeDriver, FireFoxDriver, SafariDriver,EdgeDriver extends from  RemoteWebDrive - classes (C)

        // Scenarios 1
        // 1. Do you want to run only on Chrome
        ChromeDriver chromeDriver = new ChromeDriver();
       // chromeDriver = new FirefoxDriver();     // not allow

        // Scenarios 2
        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();     //  allow
        driver = new EdgeDriver();
        driver = new SafariDriver();

        // Scenarios 3
        // Do you want to run on multiple browsers, aws machine
        // RemoteWebDriver driver (with Grid) is used


//         SearchContext driver = new RemoteWebDriver();
        SearchContext driver1 = new ChromeDriver();

        //WebDriver webDriver = new RemoteWebDriver();
        WebDriver webDriver1 = new ChromeDriver();

        RemoteWebDriver remoteWebDriver = new ChromeDriver();

       // RemoteWebElement remoteWebElement = new FirefoxDriver();

        ChromeDriver chromeDriver1= new ChromeDriver();

    }
}
