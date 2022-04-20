package com.test.orangehrm.pages;

import Utilis.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminPage {

    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeNameInput;


    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoles;




    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement newUserName;


    @FindBy(name = "systemUser[status]")
    WebElement status;



    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement newPassword;


    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmationOfPassword;


    @FindBy(id = "btnSave")
    WebElement saveButton;



    @FindBy(xpath = "//a[contains(@href,'saveSystemUser')]")
    List<WebElement> allNames;



    public void sendALlInformationForEmployee() {
        addButton.click();
        BrowserUtils.selectBy(userRoles,"Admin","text");
        employeeNameInput.sendKeys("Alice Duval");
        newUserName.sendKeys("kerimcchik");
        BrowserUtils.selectBy(status,"0","value");
        newPassword.sendKeys("aikerim12345");
        confirmationOfPassword.sendKeys("aikerim12345");
        saveButton.click();
    }


    public boolean ValidationTheEmployeeIsCreated(String Username){

        for(WebElement name:allNames){
            if(BrowserUtils.getTextMethod(name).equals(Username)){
                return true;
            }
        }
        return false;

    }



    @FindBy(xpath = "//td[3]")
    List<WebElement> allTheRolesOnTheTable;


    @FindBy(xpath = "//select[@name='searchSystemUser[userType]']")
    WebElement userRoleButton;

    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchBTn;


    public void selectUserRoleBtn(String rolename, WebDriver driver){
        userRoleButton.click();
        BrowserUtils.selectBy(userRoleButton,rolename, "text");
        BrowserUtils.ClickWithJS(driver, searchBTn);

    }





    public boolean validateRolesText(String pickRoleName){

        for(WebElement role: allTheRolesOnTheTable){
            if(!role.getText().trim().equals(pickRoleName)){
                return false;
            }
        }

        return true;
    }







}
