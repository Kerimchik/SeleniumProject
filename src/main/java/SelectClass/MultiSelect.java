package SelectClass;

import Utilis.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiSelect {



    @Test
    public void multiSelectAndFirstSelectPractice(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///Users/aikerim/Desktop/aikaa.html");
        driver.manage().window().maximize();

        WebElement header = driver.findElement(By.id("techtorial1"));

        BrowserUtils.getTextMethod(header);



        WebElement multiSelectBox = driver.findElement(By.xpath("//select[@class ='select']"));

        BrowserUtils.selectBy(multiSelectBox, "Two", "text");
        BrowserUtils.selectBy(multiSelectBox, "3", "index");
        BrowserUtils.selectBy(multiSelectBox, "1", "value");


        Select select = new Select(multiSelectBox);
        //select.deselectAll();
        select.deselectByIndex(3);


        WebElement countList = driver.findElement(By.name("country"));
        Select country = new Select(countList);
      //  String actualFirstSelectedOption = country.getFirstSelectedOption().getText().trim();
        String actualFirstSelectedOption =BrowserUtils.getTextMethod(country.getFirstSelectedOption());
        String expectedFirstSelectionOption = "UNITED STATES";
        Assert.assertEquals(actualFirstSelectedOption,expectedFirstSelectionOption);







    }





}
