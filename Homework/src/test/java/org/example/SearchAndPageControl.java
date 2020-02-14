package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class SearchAndPageControl {

    WebDriver driver;
    DriverSettings dr = new DriverSettings();

    /* Checks the page number */
    @Test
    public void SearchAndGo(){
        String pagenumber;

        driver = dr.setUp();

        pagenumber = doSearchAndChangePage(driver);
        Assert.assertEquals("Page 2 could not be opened.",pagenumber,"active ");

        dr.tearDown(driver);
    }

    /* Does search "Bilgisayar" keyword and list products then goes to page 2 and return page number value */
    public String doSearchAndChangePage(WebDriver driver) {
        String pagenumber;
        SearchDataAndChangePage searchdata = new SearchDataAndChangePage(driver);
        searchdata.driver.get("https://www.n11.com");
        searchdata.searchinput.sendKeys("Bilgisayar");
        searchdata.searchbutton.click();
        dr.waitSeconds(5);
        searchdata.gotopage2.click();
        pagenumber = searchdata.page2.getAttribute("class");
        return pagenumber;
    }
}
