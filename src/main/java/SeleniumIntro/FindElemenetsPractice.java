package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElemenetsPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        WebElement news = driver.findElement(By.id("root_2"));
        news.click();

        Thread.sleep(5000);

        List<WebElement> hedaers  = driver.findElements(By.tagName("h3"));
        int counter =0;

        for(int i=0; i< hedaers.size(); i++){
          //  System.out.println(hedaers.get(i).getText());

            if(hedaers.get(i).getText().contains("COVID")){
                System.out.println(hedaers.get(i).getText());
                counter++;
            }
        }

        System.out.println(counter);




//
//        List<WebElement> boxes = driver.findElements(By.xpath("//h3[@class='Mb(5px)']"));
//        int count =0;
//        for(WebElement box : boxes){
//            if(box.getText().equalsIgnoreCase("covid")){
//                count++;
//            }
//            System.out.println(box.getText());
//
//        }
//
//        System.out.println(count);




    }
}
