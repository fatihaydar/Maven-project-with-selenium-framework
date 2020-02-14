package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncreaseQuantityAndCheck {
    WebDriver driver;
    /* Path to increase quantity element on basket page*/
    @FindBy(xpath = "//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[1]")
    WebElement increasequantity;

    /* Path to quantity value on basket page */
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/input")
    WebElement quantityvalue;

    // Constructor method
    public IncreaseQuantityAndCheck(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement increaseQuantity(){
        return increasequantity;
    }
    public WebElement QuantityValue(){
        return quantityvalue;
    }
}
