package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TESTNGWithREALWebsite {

    @Test  //I am testing that the website is correct
    public void validateWebsite() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        String actualWebsite = driver.getCurrentUrl();
        String expectedWebsite = "https://demo.opencart.com/admin/";
        Assert.assertEquals(actualWebsite, expectedWebsite);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        driver.close();


    }


    @Test
    public void validateCatalogisDeisplayed() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        boolean ActualCatalog = catalogBar.isDisplayed();
        boolean ExpectedCatalog = true;
        Assert.assertEquals(ActualCatalog, ExpectedCatalog, "not ther");
        catalogBar.click();

        driver.close();
    }


    // contains for finding element //a[.='Products']

    @Test
    public void validateProductsisDisplayed() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(400);

        WebElement ProductsBar = driver.findElement(By.xpath("//a[.='Products']"));
        boolean ActualproductBar = ProductsBar.isDisplayed();
        boolean ExpectedproductBar = true;
        Assert.assertEquals(ActualproductBar, ExpectedproductBar);
        ProductsBar.click();
        driver.close();
    }


    @Test
    public void validatoinOfBoxes() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();

        WebElement ProductsBar = driver.findElement(By.xpath("//a[.='Products']"));
        ProductsBar.click();


        List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 1; i < boxes.size(); i++) {
            Thread.sleep(400); //to see everything one by one slowly
            boxes.get(i).click();
            boolean ActualValidationOfBoxes = boxes.get(i).isDisplayed();
            boolean ExpectedValiadationOfBoxes = true;
            Assert.assertEquals(ActualValidationOfBoxes, ExpectedValiadationOfBoxes);
            boolean ActualValidationOfBoxesSelected = boxes.get(i).isDisplayed();
            boolean ExpectedValiadationOfBoxesSelected = true;
            Assert.assertEquals(ActualValidationOfBoxesSelected, ExpectedValiadationOfBoxesSelected);






        }
    }












}