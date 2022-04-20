package TESTNG;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before Suit");
        /* You can use set up your Chrome browser properties
           (deleteCookies)
        */
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println(" BeforeTest");
          /* You can use to launch your browser
        */
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
        //you can navigate to website
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before method");
        //you can use it to login the page
    }

    @Test
    public void test1(){
        System.out.println("test-1");
    }

    @Test
    public void test2(){
        System.out.println("test-2");
    }


    @AfterMethod
    public void aftermethod(){
        System.out.println("After method");
        //You can take a screenshot for failed test annotations
        //driver.quit();
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("After Suit");
    }


    //Because of SingleTon Pattern  and because I made it private in D
  //  Driver driver = new Driver();




}
