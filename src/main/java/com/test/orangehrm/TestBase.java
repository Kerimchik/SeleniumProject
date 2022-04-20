package com.test.orangehrm;

import Utilis.BrowserUtils;
import Utilis.ConfigReader;
import Utilis.DriverHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = DriverHelper.getDriver();

        //comes from configuration.properties which wraps everything
        driver.get(ConfigReader.readProperty("urlorangehrm"));



    }



    @AfterMethod
    public void tearDown(ITestResult result){

        if(!result.isSuccess()){

            BrowserUtils.getScreenshot(driver,"OrangeHrmScreenShot");

        }



        DriverHelper.tearDown();
    }




}
