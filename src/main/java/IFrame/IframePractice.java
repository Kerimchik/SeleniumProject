package IFrame;

import Utilis.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePractice {



    @Test
    public void iframeTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.switchTo().frame("mce_0_ifr");

        //Do not forget to switch your frame before you find the element


        WebElement box = driver.findElement(By.id("tinymce"));
        box.clear();
        box.sendKeys("Aikerim's Iframe Practice");
        WebElement header = driver.findElement(By.tagName("h3"));
        String actealHeader = BrowserUtils.getTextMethod(header);
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actealHeader,expectedHeader);
    }

    //NESTEDFRAME




}
