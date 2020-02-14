package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class RandomProductAndCheckPrices {
    WebDriver driver;
    DriverSettings dr = new DriverSettings();

    /* Select a random product from product list page. Extract prices from product detail page and from basket page then compare both of them each other. Finally increase quantity on basket page then check the quantity.  */
    @Test
    public void checkPrices(){
        String price,priceinorder,quantity;

        DriverSettings dr = new DriverSettings();
        driver = dr.setUp();

        price = randomProduct(driver);
        priceinorder = addBasketAndCheckPrices(driver);
        Assert.assertEquals("Prices are not equal.",price,priceinorder);

        quantity = increaseQuantityAndCheck(driver);
        Assert.assertEquals("Quantity is not 2.",quantity,"2");


        dr.tearDown(driver);
    }

    /* Increase quantity and return the quantity value */
    public String increaseQuantityAndCheck(WebDriver driver){
        String quantity;
        IncreaseQuantityAndCheck incquantity = new IncreaseQuantityAndCheck(driver);
        dr.waitSeconds(1);
        incquantity.increasequantity.click();
        dr.waitSeconds(1);
        quantity = incquantity.quantityvalue.getAttribute("value");
        return quantity;
    }

    /* Select a random product from product list page then return price from product detail page */
    public String randomProduct (WebDriver driver)  {
        String price;
        Random r = new Random();
        int randomnumber = r.nextInt(15)+1;
        driver.get("https://www.n11.com/arama?q=Bilgisayar&pg=2");
        driver.findElement(By.xpath("//*[@id=\"view\"]/ul/li["+randomnumber+"]/div/div[1]/a")).click();
        dr.waitSeconds(5);
        AddBasketAndCheckPrices choiseproduct = new AddBasketAndCheckPrices(driver);
        price = choiseproduct.price.getText();
        return price;
    }
    /* Add the product to basket and go basket page then return price from basket page */
    public String addBasketAndCheckPrices(WebDriver driver) {
        String priceinorder;
        AddBasketAndCheckPrices choiseproduct = new AddBasketAndCheckPrices(driver);
        choiseproduct.addbasket.click();
        dr.waitSeconds(5);
        choiseproduct.gobasket.click();
        priceinorder = choiseproduct.priceonbasket.getText();
        return priceinorder;
    }
}
