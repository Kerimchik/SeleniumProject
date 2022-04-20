package WindowHandle;

import Utilis.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {


    @Test
    public void practice1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        System.out.println(driver.getWindowHandle());
        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        BrowserUtils.ClickWithJS(driver,clickHere);
        System.out.println(driver.getWindowHandles());


        String mainPage = driver.getWindowHandle();
        Set<String> allPagesId = driver.getWindowHandles();

      //Only for 2 tabs
        for(String id:allPagesId){
            System.out.println(id);
            if(!id.equals(mainPage)){
                driver.switchTo().window(id);
            }


        }

        WebElement newWindow = driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println(newWindow.getText());

        String ActualNewWindowText = newWindow.getText();
        String ExpectedNewWindowText = "New Window";

        Assert.assertEquals(ActualNewWindowText,ExpectedNewWindowText);
    }










    @Test
    public void WindowHandlepractice2(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String mainPage = driver.getWindowHandle();
        WebElement newTabBtn = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
        BrowserUtils.ClickWithJS(driver,newTabBtn);


BrowserUtils.SwitchOnlyTwoTabs(driver,mainPage);

//        Set<String> allPagesId = driver.getWindowHandles();
//
//        //Only for 2 tabs
//        for(String id:allPagesId){
//            System.out.println(id);
//            if(!id.equals(mainPage)){
//                driver.switchTo().window(id);
//            }
//
//
//        }

        WebElement header = driver.findElement(By.xpath("//h1[@itemprop='name']"));
        String ActualNewWindowText = header.getText();
        String ExpectedNewWindowText = "AlertsDemo";
        Assert.assertEquals(ActualNewWindowText,ExpectedNewWindowText);


        WebElement clickMeBtn = driver.findElement(By.xpath("//button[@id='alertBox']"));
        String ActualclickMeBtn = header.getText();
        String ExpectedclickMeBtn = "Click Me";
        Assert.assertEquals(ActualNewWindowText,ExpectedNewWindowText);


    }














}
