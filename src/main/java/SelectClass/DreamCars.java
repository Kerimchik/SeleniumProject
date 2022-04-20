package SelectClass;

import Utilis.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DreamCars {


    @Test
    public void Caddilac() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cars.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement stockType = driver.findElement(By.name("stock_type"));
        BrowserUtils.selectBy(stockType, "used","value");



        WebElement make = driver.findElement(By.xpath("//select[@id='makes']"));
        BrowserUtils.selectBy(make, "5","index");




        WebElement model = driver.findElement(By.xpath("//select[@id='models']"));
        BrowserUtils.selectBy(model, "Escalade","text");



        WebElement price = driver.findElement(By.xpath("//select[@id='make-model-max-price']"));
        BrowserUtils.selectBy(price, "$80,000","text");


        //select[@id='make-model-maximum-distance']
        Thread.sleep(3000);

        //select[@ aria-labelledby='ae-formFieldLabelOptIn_s4zts9ujnte_2']
        WebElement distance = driver.findElement(By.id("make-model-maximum-distance"));
        BrowserUtils.selectBy(distance, "10","value");


        //input[@aria-label='Enter a Zip Code' and @id='make-model-zip']

        WebElement zipcod = driver.findElement(By.xpath("//input[@aria-label='Enter a Zip Code' and @id='make-model-zip']"));
        zipcod.clear();
        Thread.sleep(3000);
        zipcod.sendKeys("60647");




        WebElement searchBtn = driver.findElement(By.xpath("//button[@type='submit' and @data-searchtype='make']"));
        searchBtn.click();



        WebElement header = driver.findElement(By.xpath("//h1[@class='sds-heading--1 sds-page-section__title']"));

        String ActualHeader = BrowserUtils.getTextMethod(header);
        String ExpectedHeader = "Used Cadillac Escalade for sale";
        Assert.assertEquals(ActualHeader,ExpectedHeader);


        List<WebElement> listOfCars = driver.findElements(By.xpath("h2[@class='title']"));


        for(WebElement car: listOfCars){
            boolean contains = car.getText().toLowerCase().contains("cadillac");
            Assert.assertTrue(contains);

         }



    }







}
