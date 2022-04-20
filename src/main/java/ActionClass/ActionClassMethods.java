package ActionClass;

import Utilis.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sql.rowset.BaseRowSet;

public class ActionClassMethods {


    @Test
    public void doubleClick(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement doubleClickButton =driver.findElement(By.tagName("button"));
        Actions actions = new Actions(driver);
       // actions.doubleClick(doubleClickButton).perform();
        //actions.doubleClick(driver.findElement(By.tagName("button"))).perform();



        WebElement rightClick =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions actions2 = new Actions(driver);
        actions2.contextClick(rightClick).perform();


    }


    @Test
    public void doubleClickPractice() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");

        //button[.='Double-Click me to see Alert message']

        WebElement doubleClickButtonPrac =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButtonPrac).perform();
    }



    @Test
    public void dragAndDrop(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
        WebElement acceptCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookies.click();

        Actions actions= new Actions(driver);
        for(int i =0; i<5; i++){
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }

        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement orangeBox = driver.findElement(By.xpath("//div[@class='test2']"));
        String actualMessage = BrowserUtils.getTextMethod(orangeBox);
        String expectedMessage = "... Or here.";
        Assert.assertEquals(actualMessage,expectedMessage);
        Actions actions1 = new Actions(driver);
        actions1.dragAndDrop(draggable,orangeBox).perform();
        orangeBox = driver.findElement(By.xpath("//div[@class='test2']"));
        String actualAfterDragAndDrop = BrowserUtils.getTextMethod(orangeBox);
        String expectedAfterDragAndDrop = "You did great!";
        Assert.assertEquals(actualAfterDragAndDrop,expectedAfterDragAndDrop);

        String cssValue = orangeBox.getCssValue("background-color");
        String cssexpectedValue ="rgba(238, 111, 11, 1)";

        Assert.assertEquals(cssValue,cssexpectedValue);
    }



    @Test
    public void clickAndHold(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
        WebElement blueBox = driver.findElement(By.xpath("//div[@class='test1']"));
        String actualBlueBoxMessage = BrowserUtils.getTextMethod(blueBox);
        String expectedBlueBoxMessage = "Drag the small circle here ...";
        Assert.assertEquals(actualBlueBoxMessage,expectedBlueBoxMessage);

        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(draggable).moveToElement(blueBox).release().perform();




    }



    @Test
    public void TaskDragANdDrop(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();

        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable' and .='Drop here']"));

        String actualMessage = BrowserUtils.getTextMethod(droppable);
        String expectedMessage = "Drop here";
        Assert.assertEquals(actualMessage,expectedMessage);
        Actions actions1 = new Actions(driver);
        actions1.dragAndDrop(draggable,droppable).perform();


    //div[@id='draggable']


    //div[@id='simpleDropContainer']//div[@id='droppable' and .='Drop here']


        String actualcssColorValue = droppable.getCssValue("background-color");

        String cssexpectedValue ="rgba(70, 130, 180, 1)";

        Assert.assertEquals(actualcssColorValue,cssexpectedValue);

}


    @Test
    public void Task2clickAndHold() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//a[@data-rb-event-key='accept']"));
        button.click();
        Thread.sleep(4000);
        WebElement droppable = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable' and .='Drop here']"));
        WebElement notAcceptable = driver.findElement(By.id("notAcceptable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(notAcceptable).moveToElement(droppable).release().perform();
        String actualBlueBoxMessage = BrowserUtils.getTextMethod(droppable);
        String expectedBlueBoxMessage = "Drop here";
        Assert.assertEquals(actualBlueBoxMessage,expectedBlueBoxMessage);

        String actualCssColor= droppable.getCssValue("background-color");
        String expectedCssColor = "rgba(0, 0, 0, 0)";
        Assert.assertEquals(actualCssColor,expectedCssColor);
//div[@id='acceptable']

        WebElement acceptable = driver.findElement(By.xpath("//div[@id='acceptable']"));
        Actions actions1 = new Actions(driver);
        actions1.clickAndHold(acceptable).moveToElement(droppable).release().perform();

        droppable = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable' and .='Dropped!']"));
        String actualBlueBoxMessage2 = BrowserUtils.getTextMethod(droppable);
        String expectedBlueBoxMessage2 = "Dropped!";
        Assert.assertEquals(actualBlueBoxMessage,expectedBlueBoxMessage);


        String actualCssColor2= droppable.getCssValue("background-color");
        String expectedCssColor2 = "rgba(70, 130, 180, 1)";
        Assert.assertEquals(actualCssColor2,expectedCssColor2);
    }




    @Test
    public void MoveOffSet(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();
        WebElement slider = driver.findElement(By.xpath("//input"));
        Actions actions = new Actions(driver);
        //x means->horizontal; y means vertical
        actions.clickAndHold(slider).moveByOffset(70,0).perform();


    }




    @Test
    public void sliderSHortCut() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();
        WebElement slider = driver.findElement(By.xpath("//input"));

        WebElement range = driver.findElement(By.xpath("//span[@id='range']"));
        String myRange = "4.5";


        while(!range.getText().trim().equals(myRange)){
            Thread.sleep(1000);
            slider.sendKeys(Keys.ARROW_RIGHT);
        }




    }









    @Test
    public void TaskWithKeys(){

/*        TASK FOR STUDENTS:
        1)navigate to the Website "https://text-compare.com/"
        2)Type with the Keys --> "Good Bye Keys"
        3)with CTRL(COMMAND)+A --> select all text
        4)Copy this text CTRL(COMMAND) + C --> it will copy the text
        5)Go to the second box and paste CTRL(COMMAND) + V-->it will paste the text
        6) Validate this two boxes text are matching*/



        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
       WebElement text1 = driver.findElement(By.xpath("//textarea[@name='text1']"));



        actions.moveToElement(text1)
                .click().keyDown(Keys.SHIFT)
                .sendKeys("Good Bye Keys")
                .doubleClick().keyDown(Keys.COMMAND)
                .sendKeys("c")
                .sendKeys(Keys.ENTER).perform();

        String Actualtext1=text1.getText().trim();


      //  Actions actions2 = new Actions(driver);

        WebElement text2 = driver.findElement(By.xpath("//textarea[@name='text2']"));
        actions.moveToElement(text2)
                .click().keyDown(Keys.SHIFT)
                .sendKeys(Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ENTER).perform(); //Keys.Return



        String Actualtext2=text2.getText().trim();


        Assert.assertEquals(Actualtext1,Actualtext2);

        //googleSearchBox.sendKeys("SeleniumSelenium");
        //Keys.Arrow right/left/up/down
        //Keys.ENTER or Keys.RETURN


    }



    @Test
    public void MoveByOffSetPractice(){



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement browseCourse= driver.findElement(By.xpath("//a[.='Browse Course']"));
        BrowserUtils.ClickWithJS(driver,browseCourse);

//        WebElement contactUs = driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Contact Us']"));
//        BrowserUtils.ClickWithJS(driver,contactUs);



        WebElement contactUs = driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Contact Us']"));
        Point coordinatesofContacts = contactUs.getLocation();
        int xCord= coordinatesofContacts.getX();
        int yCord= coordinatesofContacts.getY();
        Actions actions = new Actions(driver);
        actions.moveByOffset(xCord,yCord).click().perform();






    }








}