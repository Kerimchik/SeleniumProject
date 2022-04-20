package com.test.etsy;

import Utilis.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EtsyTestBase {

   // public WebDriver driver =  DriverHelper.getDriver();
   public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver =  DriverHelper.getDriver();
        driver.get("https://www.etsy.com/");
    }



    @AfterMethod
    public void tearDown(){
       // System.out.println("I am running after every Test Annotation");
      //  driver.quit();
        DriverHelper.tearDown();
    }
}
