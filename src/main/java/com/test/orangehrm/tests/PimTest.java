package com.test.orangehrm.tests;

import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import com.test.orangehrm.pages.PimPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends TestBase {
    LoginPage loginPage;
    MainPage mainPage;
    PimPage pimPage;

    @BeforeMethod
    public void initializingPages(){
        loginPage= new LoginPage(driver);
        mainPage= new MainPage(driver);
        pimPage =new PimPage(driver);
    }

    @Test
    public void ValidationOfAdditionEmployee(){
       //LoginPage loginPage= new LoginPage(driver);
        loginPage.login("Admin","admin123");
       // MainPage mainPage= new MainPage(driver);
        mainPage.clickPimButton();
       // PimPage pimPage =new PimPage(driver);
        pimPage.AddEmployeeForPim("Jasmine","Peri","Usen","1998", "/Users/aikerim/Desktop/images/me.jpeg");

        Assert.assertEquals(pimPage.validateFirstName(),"Jasmine");
        Assert.assertEquals(pimPage.validateLastName(),"Usen");
        Assert.assertTrue(pimPage.validateEmployeeId("1998"),"true");
    }


    @Test
    public void validatePersonalDetailElement(){

        loginPage.login("Admin","admin123");

        mainPage.clickPimButton();
        pimPage.AddEmployeeForPim("Jasmine","Peri","Usen","1998", "/Users/aikerim/Desktop/images/me.jpeg");
        pimPage.EditingPersonalDetails("Kyrgyz", "11/08/1998", "Married");
        Assert.assertEquals(pimPage.validateNationality(),"Kyrgyz");

    }







}
