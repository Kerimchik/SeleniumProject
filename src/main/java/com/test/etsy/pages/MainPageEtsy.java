package com.test.etsy.pages;

import Utilis.BrowserUtils;
import com.test.etsy.EtsyTestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import java.util.List;
import java.util.Locale;

public class MainPageEtsy {

    public MainPageEtsy(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    WebElement searchBox;



    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    WebElement searchButton;

    public void searchItem(String item){
        searchBox.sendKeys(item); //Keys.Enter
        searchButton.click();
    }







    @FindBy(xpath = "//a//h3") //li//h3
    List<WebElement> allHeaders;


    public boolean validateHeader(){
        for(WebElement header: allHeaders){
            String h3 = BrowserUtils.getTextMethod(header).toLowerCase();
            if(h3.contains("iphone") || h3.contains("13") || h3.contains("case")){
                return true;
            }
        }
        return false;
    }







}
