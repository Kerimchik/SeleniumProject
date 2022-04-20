package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndTags {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/aikerim/Desktop/aikaa.html");
        driver.manage().window().maximize();



        WebElement javalink = driver.findElement(By.linkText("Java"));
        javalink.click();
        System.out.println( driver.getCurrentUrl());
        System.out.println( driver.getTitle());
        driver.navigate().back();

        WebElement seleniumlink = driver.findElement(By.linkText("Selenium"));
        seleniumlink.click();
        System.out.println( driver.getCurrentUrl());
        System.out.println( driver.getTitle());
         driver.navigate().back();


        WebElement cucumberlink = driver.findElement(By.linkText("Cucumber"));
        cucumberlink.click();
        System.out.println( driver.getCurrentUrl());
        System.out.println( driver.getTitle());
        driver.navigate().back();
//
//        WebElement javalink2 = driver.findElement(By.linkText("Java"));
//        javalink2.click();

        javalink = driver.findElement(By.linkText("Java"));
       javalink.click(); //---> Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
/*   This exception might happen when element was on the page but my driver is not able to see the element anymore.
*   1) The element values is updated (like attribute)
*       button id ="tec2" when you click this button it updates did (dynamic)
*       Webelemnet button = driver.findelement(By.id ="tec2")
* button.click();
* id =tec3
*
* 2)The page is refreshed
* 3) After navigating to the other page, if you come back to original page
*
*
*
* */


        System.out.println( driver.getCurrentUrl());
        System.out.println( driver.getTitle());
        driver.navigate().back();

        WebElement restApi = driver.findElement(By.partialLinkText("Rest"));
        restApi.click();
        driver.navigate().back();



        //WIth Tag Name

        WebElement version = driver.findElement(By.tagName("u"));
        System.out.println(version.getText());


      /*  XPath is the most advance way of finding elements
                Syntax: Tagname[@attributName ='AttributeValue']

              We have 2 type of XXPAth

                1) Absolute Xpath: it starts with the single slash(/) and it goes from all the way top to bottom (carinventory/car/brand[1])


                2) RELATIVE XPATH: IS THE most common xpath that people use and there could be parent-child relationship for relative as well but
                it mostly focuses on the direct child.
               Syntax: Tagname[@attributName ='AttributeValue']
      */








    }

}
