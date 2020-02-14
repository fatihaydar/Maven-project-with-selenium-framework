package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class HomePageAndLoginPage {
        DriverSettings dr = new DriverSettings();
        WebDriver driver;

        /* Checking the homepage is opened and login it was happened successfully   */
        @Test
        public void HomeAndLogin() {
            String title,checklogin;

            driver = dr.setUp();

            title = homeCheck(driver);
            Assert.assertEquals("\n" +"Homepage could not be opened.",title,"n11.com - Alışverişin Uğurlu Adresi");

            checklogin = beLogin("e-mail","password",driver);
            Assert.assertEquals("Login failed.",checklogin,"Siparişlerim - n11.com");

            dr.tearDown(driver);
        }
         /* Open Login page, be login and return orders title for check*/
         public String beLogin(String username, String password,WebDriver driver){
            String checklogin;
            LoginPage loginpage = new LoginPage(driver);
            loginpage.loginpagepath.click();
            loginpage.useremail.sendKeys(username);
            loginpage.userpassword.sendKeys(password);
            loginpage.userloginbutton.click();
            driver.get("https://www.n11.com/hesabim/siparislerim");
            checklogin = driver.getTitle();
            return checklogin;
         }
         /* Open the home page and return title of home page */
         public String homeCheck(WebDriver driver){
            String title;
            driver.get("https://www.n11.com");
            title = driver.getTitle();
            return title;
        }
}
