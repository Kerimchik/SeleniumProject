package com.test.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    //DIDN'T QUIET GET IT
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//b[.='Admin']")
    WebElement admin;

    public void clickAdminButton(){
        admin.click();
    }


    @FindBy(xpath = "//b[.='PIM']")
    WebElement pim;

    public void clickPimButton(){
        pim.click();
    }





}
