package Homework.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class TestCase {

/*    INTERVIEW QUESTION:
*
* WEB-DRIVER  is  a connection between webpage and your system
* I need web-driver to manipulate the webpage elements.
* First step of starting automation should be reading the test case(task)
* step by step implement the requirements
*
* */







    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameBugs = driver.findElement(By.xpath("//input[@id='userName']"));
        fullNameBugs.sendKeys( "Aikerim Ibragimova");
        System.out.println(fullNameBugs.getText());



        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys( "4152 Keystone Street");
        System.out.println(currentAddress.getText());



        WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmail.sendKeys( "aika@auca.kg");
        System.out.println(userEmail.getText());



        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys( "490 MacArthur Avenue");
        System.out.println(permanentAddress.getText());


        WebElement button= driver.findElement(By.xpath("//button[@id='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

        button.click(); //ElementClickInterceptedException

        System.out.println("I did click");

        WebElement nameValidator = driver.findElement(By.xpath("//p[@id='name']"));
        System.out.println(nameValidator.getText());

        String expectedValidation = "Name:Aikerim Ibragimova";
        String actualValidation= nameValidator.getText();

        if(expectedValidation.equals(actualValidation)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
