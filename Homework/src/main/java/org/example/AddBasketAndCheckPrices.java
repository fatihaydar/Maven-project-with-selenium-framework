package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddBasketAndCheckPrices {
    WebDriver driver;

    /* Path to product price on product detail page */
    @FindBy(xpath = "//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[1]/div/ins")
    WebElement price;

    /* Path to addbasket button on product detail page */
    @FindBy(xpath = "//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]")
    WebElement addbasket;

    /* Path to basket button */
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/a")
    WebElement gobasket;

    /* Path to product price on basket page */
    @FindBy(xpath = "//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[2]/div/span")
    WebElement priceonbasket;

    // Constructor method
    public AddBasketAndCheckPrices(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement Price(){
        return price;
    }
    public WebElement addBasket(){
        return addbasket;
    }
    public WebElement goBasket(){
        return gobasket;
    }
    public WebElement priceOnBasket(){
        return priceonbasket;
    }
}
