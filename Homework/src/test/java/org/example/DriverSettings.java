package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSettings {
    WebDriver driver;

    /* Start web driver method */
    public WebDriver setUp() {
        System.setProperty("webdriver.chrome.driver"," Path to chrome browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    /* Close web driver method */
    public void tearDown(WebDriver driver) {
        driver.quit();
    }

    /* Wait method for loading page */
    public void waitSeconds(Integer seconds){
        seconds=seconds*1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
