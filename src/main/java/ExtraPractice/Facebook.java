package ExtraPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        String actualUrl= driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/";

        if(actualUrl.equals(expectedURL)){
            System.out.println("The website is correct");
        }else{
            System.out.println("The website is wrong");
        }

        //ATTRIBUTES CAN BE DYNAMIC AN
        WebElement createnewaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        boolean validationButton = createnewaccount.isDisplayed();
        boolean expectedvalidationButton = true;

        if(validationButton == expectedvalidationButton){
            System.out.println("The Button is there");
        }else{
            System.out.println("The Button is NOT there");
        }


       // ((JavascriptExecutor) driver).executeScript("arguments[0].click()",createnewaccount);

        createnewaccount.click();


        Thread.sleep(500);

//FirstName    //input[@placeholder='First name']
        WebElement firstname = driver.findElement(By.xpath("//input[@tabindex='0']"));
        firstname.sendKeys("Aikerim");
        System.out.println( firstname.getText());




          //input[@name='lastname']
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Bragim");
        System.out.println( lastname.getText());




        WebElement email = driver.findElement(By.xpath("//input[@ aria-label='Mobile number or email']"));
        email.sendKeys("aika@auca.kg");
        String emailPrevious = email.getText();
        System.out.println( email.getText());



        //  //input[@name='reg_email__']
//Re-enter email

        WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        reEmail.sendKeys("aika@auca.kg");
        System.out.println(reEmail.getText());

        if(email.getText().equals(reEmail.getText())){
            System.out.println( "emails are matching");
        }else{
            System.out.println( "emails are not matching");
        }


        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("Kerimaqje48201507573298");
        System.out.println(password.getText());





        WebElement gender = driver.findElement(By.xpath("//input[@value='1' and @name='sex']"));
        gender.click();


        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("1998");


        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys("Nov");


        WebElement day = driver.findElement(By.id("month"));
        day.sendKeys("8");


        WebElement submitButton = driver.findElement(By.xpath("//button[@name='websubmit']"));

        submitButton.click();


        //button[@name='w-=6yn[@name='websubmit']']"));
      //  ((JavascriptExecutor) driver).executeScript("arguments[0].click()",signUpButton);
      //  signUpButton.click();
    }
}
