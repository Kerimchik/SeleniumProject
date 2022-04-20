package com.test.orangehrm.tests;

import Utilis.ConfigReader;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

LoginPage loginPage;
@BeforeMethod
public void intiliazePage(){
    loginPage = new LoginPage(driver);
}



@Test
public void validateLoginPosisitive() {


//    WebDriverManager.chromedriver().setup();
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//    driver.manage().window().maximize();
 //   LoginPage loginPage= new LoginPage(driver);
    loginPage.login(ConfigReader.readProperty("orangehrmusername"), ConfigReader.readProperty("orangehrmpassword"));
//    String actualUrl = driver.getCurrentUrl();
//    String expectedUrl ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
}


//2

@Test(dataProvider = "LoginNegativeTestScenario", dataProviderClass = DataProvidertask.class)
    public void validateLoginPNegative1(String username, String password, String expectedErrorMessage){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//        driver.manage().window().maximize();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login(username, password);
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage);
    }



 //2 more negative scenarios (wrong usernage, correct password
                                //(wrong username, wrong password

//    @Test
//    public void validateLoginPNegative2(){
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
////        driver.manage().window().maximize();
//        LoginPage loginPage= new LoginPage(driver);
//        loginPage.login("", "");
//        String actualErrorMessage= loginPage.getErrorMessage();
//        String expectedErrorMessage= "Username cannot be empty";
//        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
//        String actualColor = loginPage.getColorOfTheErrorMessage();
//        String expectedColor = "rgba(221, 119, 0, 1)";
//        Assert.assertEquals(actualColor,expectedColor);
//    }




//    @Test
//    public void validateLoginPNegative3(String username, String password, String expectedErrorMessage){
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
////        driver.manage().window().maximize();
//        LoginPage loginPage= new LoginPage(driver);
//        loginPage.login("Adminn", "admin123");
//        Assert.assertEquals(loginPage.getErrorMessage(),"Invalid credentials");
//    }
//
//    @Test
//    public void validateLoginPNegative4(){
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
////        driver.manage().window().maximize();
//        LoginPage loginPage= new LoginPage(driver);
//        loginPage.login("Adminn", "admin1233");
//        Assert.assertEquals(loginPage.getErrorMessage(),"Invalid credentials");
//
//    }




    //Task modify this page according to POM











}
