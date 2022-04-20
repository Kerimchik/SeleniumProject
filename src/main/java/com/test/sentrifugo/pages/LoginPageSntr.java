package com.test.sentrifugo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSntr {
    public LoginPageSntr(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //we are going to store our elemnt

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;


    @FindBy(id = "loginsubmit")
    WebElement loginButton;

//    public void loginAsASuperAdmin(){
//        username.sendKeys("EM01");
//        password.sendKeys("sentrifugo");
//        loginButton.click();
//    }

//    public void loginAsAManager(){
//        username.sendKeys("EM02");
//        password.sendKeys("sentrifugo");
//        loginButton.click();
//    }


    //    public void loginAsUser(){
//        username.sendKeys("EM03");
//        password.sendKeys("sentrifugo");
//        loginButton.click();
//    }

    public void dynamicLogin(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.submit();
    }



}
