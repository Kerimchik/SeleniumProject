package com.test.orangehrm.tests;

import TESTNG.DataForNames;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidertask {


    @DataProvider(name = "LoginNegativeTestScenario")
    public Object[][] getNegativeScenarioData(){

        return new Object[][]{
                {"Admin", "wrongPassword", "Invalid credentials"},
                {"wrongUserName", "admin123", "Invalid credentials"},
                {"WrongUserName", "WrongPassord", "Invalid credentials"}

        };
    }







    @DataProvider(name = "essValidation")
    public Object[][] getValidationOfRolesTextBox(){

        return new Object[][]{
                {"Admin", "Admin"},
                {"ESS", "ESS"}

        };
    }

}
