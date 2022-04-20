package TESTNG;
import org.testng.annotations.Test;

public class TestNGIntro {

    @Test(priority = 1)
    public void c(){
        System.out.println("Test1");
    }

    @Test(priority = 2)
    public void b(){
        System.out.println("Test2");
    }


    @Test(priority = 3)
    public void a(){
        System.out.println("Test3");
    }























}
