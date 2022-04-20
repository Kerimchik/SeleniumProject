package Alert;

import Utilis.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsIntro {

   //Alerts/POP-Ups



    //*****Operation System Alert(OS pop up) ---> We cannot handle OS alert using Selenium
    //NOTE: Solution for this might be using RoBOT class. :)

    //HTML POP-UPS -- > We can find the element for the pop up and click/ close it

    //JAavascript pop up---> We should use A:ERT class to handlke the javascript,. This class has w4 methods to handle the alerts

    /*  Alerts Interview uestions
    *
    * If it iws coming from HTML ---> find elemenet and close it by clickcong
    * if fit is coming from OS --> slenium cannot control it
    * if it is coming fron JS -> neew to use ALErts CLASSS
    *
    *
    *
    *
    *
    * 2) How many different ways we can handle the JS aleret?
    * --> accept--> it clicks "OK" button
    *
    *
    *
    *
    *
    * 3) Alert is class, NOT AN INTERFACE
    * */

    public static String name="Techtorial";
    @Test
    public void JSAlertAcceptMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement clickJsAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        clickJsAlert.click();
//        WebElement header=driver.findElement(By.tagName("h3"));//unhandledAlertexception
//        System.out.println(header.getText());
        Alert alert= driver.switchTo().alert();
        String actualText=alert.getText();
        String expectedText="I am a JS Alert";
        Assert.assertEquals(actualText,expectedText);
        alert.accept();
        WebElement message= driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage= BrowserUtils.getTextMethod(message);
        String expectedMessage="You successfully clicked an alert";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void JSAlertDismissMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJSConfirm=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickForJSConfirm.click();
        Alert alert=driver.switchTo().alert();
        String actualText=alert.getText();
        String expectedText="I am a JS Confirm";
        Assert.assertEquals(actualText,expectedText);
        alert.dismiss();
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage=BrowserUtils.getTextMethod(message);
        String expectedMessage="You clicked: Cancel";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void AlertClassSendKeys(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJsPrompt=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickForJsPrompt.click();
        Alert alert= driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage=BrowserUtils.getTextMethod(message);
        String expectedMessage="You entered: "+name;
        Assert.assertEquals(actualMessage,expectedMessage);
    }






}
