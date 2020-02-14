package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchDataAndChangePage {
    WebDriver driver;

    /* Path to search input on home page */
    @FindBy(xpath = "//*[@id=\"searchData\"]")
    WebElement searchinput;

    /* Path to search button on hame page */
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[1]/a")
    WebElement searchbutton;

    /* Path to page 2 button on product list page*/
    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/div[4]/a[2]")
    WebElement gotopage2;

    /* Path to page 2 button when the button selected */
    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/div[4]/a[3]")
    WebElement page2;

    // Constructor method
    public SearchDataAndChangePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement searchInput (){
        return searchinput;
    }
    public WebElement searchButton(){
        return searchbutton;
    }
    public WebElement goPage2(){
        return gotopage2;
    }
    public WebElement Page2(){
        return page2;
    }
}