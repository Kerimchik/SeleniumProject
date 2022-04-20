package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

    public static void main(String[] args) {



        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");

        //  List<WebElement> boxes = driver.findElements(By.xpath("//div[@role='checkbox']"));

        WebElement bbb= driver.findElement(By.xpath("//input[@name='btnK']"));
        System.out.println(bbb.getText()); // It doesn't give when it is inside of the atributes

        System.out.println(bbb.getAttribute("value"));
        System.out.println(bbb.getAttribute("aria-label"));

        //validation

        if(bbb.getAttribute("value").equals("Google Search")){
            System.out.println( "Passed");
        }else{
            System.out.println("Failed");
        }

        driver.close();

    }



}
