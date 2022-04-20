package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");

        WebElement selementalSelenium = driver.findElement(By.xpath("//a[@href='http://elementalselenium.com/']"));

        String str = selementalSelenium.getText();
        System.out.println(str);

        WebElement title = driver.findElement(By.xpath("//h3"));

        System.out.println(title.getText());


        WebElement paragraph = driver.findElement(By.xpath("//h4[@class ='subheader']"));
        System.out.println(paragraph.getText());


        //CONTAINS METHOD


        //TAGNAME[contains(text(), 'HorizontalLine')]
         WebElement conatainsmethod = driver.findElement(By.xpath("//h3[contains(text(), 'Horizontal Slider')]"));
        System.out.println(conatainsmethod.getText());


        //Tetx: it works with text as well. But it looks for the exact text which means you need to provide the whole text.
        //Syntax --> h3[.="text"]

         WebElement textMethod = driver.findElement(By.xpath("//h3[.= 'Horizontal Slider']"));
         System.out.println(textMethod.getText());

    }
}
