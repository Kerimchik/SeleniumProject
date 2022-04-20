package JSExecuter;

import Utilis.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSMethods {


    @Test
    public void TitleMethod(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
       // System.out.println(driver.getTitle());


//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        String title = javascriptExecutor.executeScript("return document.title").toString();
//        System.out.println(title+" from JavaScript");

        String actualTitle = BrowserUtils.getTitleWithJS(driver);
        String expectedTitle ="Home Page - Techtorial";

        Assert.assertEquals(actualTitle, expectedTitle);

    }



    @Test
    public void  ClickWIthJS(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        WebElement browserCourse = driver.findElement(By.xpath("//a[.='Browse Course']"));
        javascriptExecutor.executeScript("arguments[0].click()",browserCourse);


    }




    @Test
    public void  ClickWIthJS2(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


        WebElement browserCourse = driver.findElement(By.xpath("//span[.='Hello, Sign in']"));
//        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("arguments[0].click()",browserCourse);
        BrowserUtils.ClickWithJS(driver,browserCourse);


    }




    @Test
    public void  ClickWIthJSPractice(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");

       // navigation hidden-xs

        WebElement studentLogIn = driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//div //a[.='Student login']"));
//        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("arguments[0].click()",browserCourse);
        BrowserUtils.ClickWithJS(driver,studentLogIn);


    }


    @Test
    public void ScrollIntoView(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.techtorialacademy.com/");

       WebElement copyright = driver.findElement(By.xpath("//p[contains(text(),'Copy')]"));
       WebElement browseCourse= driver.findElement(By.xpath("//a[.='Browse Course']"));

       BrowserUtils.ClickWithJS(driver,browseCourse);


    WebElement getStarted = driver.findElement(By.xpath("//a[.='Get Started']"));
       JavascriptExecutor js = (JavascriptExecutor) driver;
    // js.executeScript("arguments[0].scrollIntoView(true)",getStarted);


        //div//h4[.='On-Campus Course']//div//a[.='Get Started'
    }







    @Test
    public void practiceScroll() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        WebElement browseCourse= driver.findElement(By.xpath("//a[.='Browse Course']"));
        BrowserUtils.ClickWithJS(driver,browseCourse);
        Thread.sleep(500);
        WebElement GetStarted = driver.findElement(By.xpath("//h4[.='On-Campus Course']//..//a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",GetStarted);
        BrowserUtils.ClickWithJS(driver,GetStarted);
    }



    @Test
    public void ScrollWithXAndYCordinantsTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement copyright = driver.findElement(By.xpath("//p[contains(text(),'Copy')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Point location = copyright.getLocation();
        System.out.println(location.getX());
        System.out.println(location.getY());
        int xCord =location.getX();
        int yCord =location.getY();
        js.executeScript("window.scrollTo("+xCord+","+yCord+")");

    }




    @Test
    public void ScrollWithXAndYCordinantsTest2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement copyright = driver.findElement(By.xpath("//p[contains(text(),'Copy')]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        Point location = copyright.getLocation();
//        System.out.println(location.getX());
//        System.out.println(location.getY());
//        int xCord =location.getX();
//        int yCord =location.getY();
//        js.executeScript("window.scrollTo("+xCord+","+yCord+")");
        BrowserUtils.ScrollWithXAndY(driver,copyright);

    }




    @Test
    public void Ahmet() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement copyright = driver.findElement(By.xpath("//p[contains(text(),'Copy')]"));
        BrowserUtils.ScrollWithXAndY(driver,copyright);



        WebElement studentname = driver.findElement(By.xpath("//div[class='navigation hidden-xs']//a"));
        BrowserUtils.ScrollWithXAndY(driver,studentname);




    }






























}
