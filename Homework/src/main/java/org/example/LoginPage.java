package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    /* Path to login button on home page */
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]")
    WebElement loginpagepath;

    /* Path to email input */
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement useremail;

    /* Path to password input */
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement userpassword;

    /* Path to login button */
    @FindBy(xpath = "//*[@id=\"loginButton\"]")
    WebElement userloginbutton;

    // Constructor method
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement userMailPath() {
        return useremail;
    }
    public WebElement userPassPath() {
        return userpassword;
    }
    public WebElement userLoginPath() {
        return userloginbutton;
    }
}
