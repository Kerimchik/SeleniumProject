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

public class SelectClassWithExample {


    @Test
    public void ValidationTripButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");

        WebElement oneWayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
        oneWayButton.click();
        Assert.assertTrue(oneWayButton.isDisplayed());
        Assert.assertTrue(oneWayButton.isSelected());




        WebElement roundButton = driver.findElement(By.xpath(""));
        Assert.assertFalse(roundButton.isSelected());
        Assert.assertTrue(roundButton.isDisplayed());
    }


      @Test
    public void Selectmethods(){
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.guru99.com/test/newtours/reservation.php");

          WebElement oneWayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
          oneWayButton.click();
        WebElement passenger = driver.findElement(By.name("passCount"));
          Select psngr = new Select(passenger);
          psngr.selectByIndex(1);
          WebElement departFrom = driver.findElement(By.name("fromPort"));
          Select departure = new Select(departFrom);
          departure.selectByValue("Sydney");

          WebElement month = driver.findElement(By.name("fromMonth"));
          Select mnth= new Select(month);
          mnth.selectByVisibleText("November");


          WebElement day = driver.findElement(By.name("fromDay"));
          Select dayToSelect = new Select(day);
          dayToSelect.selectByIndex(3);


          WebElement destination = driver.findElement(By.name("toPort"));
          Select dstntn = new Select(destination);
          dstntn.selectByValue("Paris");

          WebElement monthBack = driver.findElement(By.name("toMonth"));
          Select mnthBck = new Select(monthBack);
          mnthBck.selectByIndex(11);


          WebElement dayBack = driver.findElement(By.name("toDay"));
          Select dBck = new Select(dayBack);
          dayToSelect.selectByVisibleText("25");

          WebElement serviceclass = driver.findElement(By.xpath("//input[@value='First']"));
        serviceclass.click();

            WebElement airlinepref = driver.findElement(By.name("airline"));
            Select airline = new Select(airlinepref);
            airline.selectByVisibleText("Unified Airlines");


            WebElement findFlights = driver.findElement(By.name("findFlights"));
            findFlights.click();

      }





      @Test
    public void SecondWay(){

          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.guru99.com/test/newtours/reservation.php");

          WebElement oneWayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
          oneWayButton.click();
          WebElement passenger = driver.findElement(By.name("passCount"));
          BrowserUtils.selectBy(passenger,"2", "value");

          WebElement departFrom = driver.findElement(By.name("fromPort"));
//          Select departure = new Select(departFrom);
//          departure.selectByValue("Sydney");

          BrowserUtils.selectBy(departFrom,"Paris","text");

          WebElement month = driver.findElement(By.name("fromMonth"));
//          Select mnth= new Select(month);
//          mnth.selectByVisibleText("November");

          BrowserUtils.selectBy(month,"November","text" );

          WebElement day = driver.findElement(By.name("fromDay"));
//          Select dayToSelect = new Select(day);
//          dayToSelect.selectByIndex(3);
        BrowserUtils.selectBy(day,"3", "index" );

          WebElement destination = driver.findElement(By.name("toPort"));
//          Select dstntn = new Select(destination);
//          dstntn.selectByValue("Paris");

          BrowserUtils.selectBy(destination,"Paris","value");

          WebElement monthBack = driver.findElement(By.name("toMonth"));
//          Select mnthBck = new Select(monthBack);
//          mnthBck.selectByIndex(11);

          BrowserUtils.selectBy(monthBack,"11","index");

          WebElement dayBack = driver.findElement(By.name("toDay"));
//          Select dBck = new Select(dayBack);
//          dBck.selectByVisibleText("25");



          BrowserUtils.selectBy(dayBack,"25","text" );

          WebElement serviceclass = driver.findElement(By.xpath("//input[@value='First']"));
          serviceclass.click();

          WebElement airlinepref = driver.findElement(By.name("airline"));
          Select airline = new Select(airlinepref);
          airline.selectByVisibleText("Unified Airlines");


          WebElement findFlights = driver.findElement(By.name("findFlights"));
          findFlights.click();


          WebElement message = driver.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif']//font[@size='4']"));

          String ActualMessage = message.getText().trim();
           String ExpectedMessage = "After flight finder - No Seats Avaialble";
            Assert.assertEquals(ActualMessage,ExpectedMessage);

      }




}
