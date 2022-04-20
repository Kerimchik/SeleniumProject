
package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/aikerim/Desktop/aikaa.html");
        WebElement header = driver.findElement(By.id("techtorial1"));
        String actualText =  header.getText();//from the website
        String expectedText = "Techtorial Academy";//from the business requirement

        if(actualText.equals(expectedText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        WebElement paragraph = driver.findElement(By.id("details2"));
        System.out.println(paragraph.getText());


        //Locator: ClassName

        WebElement tools =driver.findElement(By.className("group_checkbox"));
        System.out.println(tools.getText());



        //Locator: Name

        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Aikerim");


        //Locator: LastName

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Bragim");



        //Locator: Phone
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("13231455");

        WebElement email = driver.findElement(By.name("userName"));
        email.sendKeys("kerimchik@auca.kg");



        WebElement javaBox = driver.findElement(By.id("cond1"));
        javaBox.click();
        System.out.println( javaBox.isDisplayed() );//returned true
        System.out.println( javaBox.isSelected()); //returned true

        WebElement testng = driver.findElement(By.id("cond3"));
        testng.click();
        System.out.println( testng.isDisplayed() );//returned true
        System.out.println( testng.isSelected()); //returned true

        WebElement cucumber= driver.findElement(By.id("cond4"));
        cucumber.click();
        System.out.println( cucumber.isDisplayed() );//returned true
        System.out.println( cucumber.isSelected()); //returned true




    }
}