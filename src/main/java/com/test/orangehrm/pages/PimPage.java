package com.test.orangehrm.pages;

import Utilis.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.Select;

public class PimPage {

   public PimPage(WebDriver driver){
       PageFactory.initElements(driver,this);
   }

    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement pimAddBtn;

   @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='middleName']")
    WebElement MiddleName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='employeeId']")
    WebElement employeeId;

    @FindBy(id = "photofile")
    WebElement chooseFile;

    @FindBy(xpath = "//input[@id='chkLogin']")
    WebElement LoginDetailsButton;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement SaveBtn;


    //for Assertion

    @FindBy(xpath = "//input[@name='personal[txtEmpFirstName]']")
    WebElement validationFName;

    @FindBy(xpath = "//input[@name='personal[txtEmpLastName]']")
    WebElement validationLastName;

    @FindBy(xpath = "//input[@name='personal[txtEmployeeId]']")
    WebElement validationEmployeeId;


    //Last Editing Task

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement editBtn;


    @FindBy(xpath = "//input[@id='personal_optGender_2']")
    WebElement gender;


    @FindBy(xpath = "//select[@id='personal_cmbNation']")
    WebElement nationality;



    @FindBy(xpath = "//select[@id='personal_cmbMarital']")
    WebElement  maritalStatus;

    @FindBy(xpath = "//input[@id='personal_DOB']")
    WebElement dateOfBirth;


    @FindBy(xpath = "//input[@id='btnSave' and @value='Save']")
    WebElement saveBtnPIM;



    public void AddEmployeeForPim(String name, String mName,String lName,String employeeId,String upload){

        pimAddBtn.click();
        firstName.sendKeys(name);
        MiddleName.sendKeys(mName);
        lastName.sendKeys(lName);
        this.employeeId.sendKeys(employeeId);
        this.chooseFile.sendKeys(upload);
        SaveBtn.click();

    }


    public String validateFirstName(){
        return validationFName.getAttribute("value");
    }

    public String validateLastName(){
        return validationLastName.getAttribute("value");
    }



    public boolean validateEmployeeId(String employeeId){
      return validationEmployeeId.getAttribute("value").endsWith(employeeId);
    }


    public void EditingPersonalDetails(String nation, String DOB,String marital){
        editBtn.click();
        gender.click();
        BrowserUtils.selectBy(nationality,nation,"text");
        dateOfBirth.clear();
        dateOfBirth.sendKeys(DOB);
        BrowserUtils.selectBy(this.maritalStatus,marital,"text");
        dateOfBirth.sendKeys(DOB);
        saveBtnPIM.click();
    }




    public String validateNationality(){
        Select select = new Select(nationality);
       return  select.getFirstSelectedOption().getText().trim();
    }




}
