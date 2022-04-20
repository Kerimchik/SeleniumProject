package Homework.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

        System.out.println("sghgfj");




        WebElement radioButton = driver.findElement(By.id("yesRadio"));
      //  radioButton.click();//IT WON'T WORK
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButton);
       ((JavascriptExecutor) driver).executeScript("arguments[0].click()",radioButton);


        Thread.sleep(5000);

        System.out.println( "smmsmms");

/*
((JavascriptExecutor) driver).executeScript("arguments[0].click()",yes);*/






       WebElement  yes= driver.findElement(By.xpath("//p[@class='mt-3']"));  //By.xpath("//p[@class='mt-3']")
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes);
        System.out.println(yes.getText());

//
//        WebElement  yesWord = driver.findElement(By.xpath("//span[@class='text-success']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesWord);
//        System.out.println(yesWord.getText());










    }

}
