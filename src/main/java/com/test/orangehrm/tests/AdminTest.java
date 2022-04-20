package com.test.orangehrm.tests;

import Utilis.ConfigReader;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.AdminPage;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminTest extends TestBase {

        @Test
       public void validateAdditionFunctionality() {

        LoginPage loginPage= new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        MainPage mainPage= new MainPage(driver);
        mainPage.clickAdminButton();
        AdminPage adminPage = new AdminPage(driver);
        adminPage.sendALlInformationForEmployee();
       // adminPage.ValidationTheEmployeeIsCreated("kerimchik");  -->returns true or false
        Assert.assertTrue(adminPage.ValidationTheEmployeeIsCreated("kerimcchik"));
        }


    @Test(dataProvider = "essValidation", dataProviderClass = DataProvidertask.class)
    public void validateLoginPNegative1(String username, String password, String expectedErrorMessage){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//        driver.manage().window().maximize();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login(username, password);
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage);
    }




    @DataProvider(name = "essValidation")
    public Object[][] getValidationOfRolesTextBox(){

        return new Object[][]{
                {"Admin"},
                {"ESS"}

        };
    }







        @Test(dataProvider = "essValidation", dataProviderClass = DataProvidertask.class)
    public void ValidateTheSelectRoleFunctions(String roleName){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login(ConfigReader.readProperty("orangehrmusername"), ConfigReader.readProperty("orangehrmpassword"));
            MainPage mainPage = new MainPage(driver);
            mainPage.clickAdminButton();
            AdminPage adminPage = new AdminPage(driver);
            adminPage.selectUserRoleBtn(roleName,driver);
            Assert.assertTrue(adminPage.validateRolesText(roleName));

        }



//    Because of Data provider I need only one Test Annotation
//    @Test
//    public void ValidateTheSelectRoleFunctions2(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login(ConfigReader.readProperty("orangehrmusername"), ConfigReader.readProperty("orangehrmpassword"));
//        MainPage mainPage = new MainPage(driver);
//        mainPage.clickAdminButton();
//        AdminPage adminPage = new AdminPage(driver);
//        adminPage.selectUserRoleBtn("ESS",driver);
//        Assert.assertTrue(adminPage.validateRolesText());
//
//    }


}
