package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestNGPracticeWithRealWebsite2 {


    @Test
    public void vaalidationOfAscentingOptions() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(5000);   //dealing with ElementNotInteractableException
        WebElement options = driver.findElement(By.xpath("//a[.='Options']"));
        options.click();
        Thread.sleep(5000);     //dealing with ElementNotInteractableException

        List<WebElement> allOptions = driver.findElements((By.xpath("//tbody/tr/td[2]")));

        Set<String> ActualOPtionOrder = new LinkedHashSet<>(); //it accecpts insertion order
        Set<String> ExpectedOPtionOrder = new TreeSet<>();

        for( WebElement option: allOptions){
            ActualOPtionOrder.add(option.getText().trim());
            ExpectedOPtionOrder.add(option.getText().trim());

            Assert.assertEquals(ActualOPtionOrder,ExpectedOPtionOrder);

        }



    }


    @Test
    public void vaalidationOfDescendingOptions() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(5000);   //dealing with ElementNotInteractableException
        WebElement DescendingOptionsBtn = driver.findElement(By.xpath("//a[.='Options']"));
        DescendingOptionsBtn.click();
        Thread.sleep(5000);     //dealing with ElementNotInteractableException
//
          List<WebElement> DescendingAllOptions = driver.findElements((By.xpath("//tbody/tr/td[2]")));

           List<String> ActualDescendingListOPtionOrder = new LinkedList<>(); //it accecpts insertion order
           List<String> ExpectedDescendingOPtionOrder = new ArrayList<>();

            for(int i=0; i< DescendingAllOptions.size(); i++){

                ActualDescendingListOPtionOrder.add(DescendingAllOptions.get(i).getText().trim());
                ExpectedDescendingOPtionOrder.add(DescendingAllOptions.get(i).getText().trim());
                Collections.sort(ExpectedDescendingOPtionOrder);
                Collections.reverse(ExpectedDescendingOPtionOrder);

            }
        Assert.assertEquals(ActualDescendingListOPtionOrder,ExpectedDescendingOPtionOrder);

    }

    @Test
    public void testDescendingTask() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(5000);   //dealing with ElementNotInteractableException
        WebElement options = driver.findElement(By.xpath("//a[.='Options']"));
        options.click();


        WebElement sortDescending = driver.findElement(By.xpath("//a[contains(text(),'Sort Order')]"));;
        sortDescending.click();

       List<WebElement> descendingNums = driver.findElements(By.xpath("//td[contains(text(),'2')]"));

        List<String> ActualDescendingNum = new LinkedList<>(); //it accecpts insertion order
        List<String> ExpectedDescendingNum = new ArrayList<>();

        for(int i=0; i< descendingNums.size(); i++){

            ActualDescendingNum.add(descendingNums.get(i).getText().trim());
            ExpectedDescendingNum.add(descendingNums.get(i).getText().trim());
            Collections.sort(ExpectedDescendingNum);
            Collections.reverse(ExpectedDescendingNum);

        }
        Assert.assertEquals(ActualDescendingNum,ExpectedDescendingNum);



    }

    @Test
    public void testAscendingTask() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(5000);   //dealing with ElementNotInteractableException
        WebElement options = driver.findElement(By.xpath("//a[.='Options']"));
        options.click();



        List<WebElement> allOptions = driver.findElements((By.xpath("//tbody/tr/td[2]")));

        Set<String> ActualOPtionOrder = new LinkedHashSet<>(); //it accecpts insertion order
        Set<String> ExpectedOPtionOrder = new TreeSet<>();

        for( WebElement option: allOptions){
            ActualOPtionOrder.add(option.getText().trim());
            ExpectedOPtionOrder.add(option.getText().trim());

            Assert.assertEquals(ActualOPtionOrder,ExpectedOPtionOrder);

        }



    }
}
