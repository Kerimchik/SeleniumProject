package TESTNG;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {


        @Parameters("FirstName")
        @Test(priority = 1, invocationCount = 4)
        public void test2(String name) {
            System.out.println(name);
        }


        @Parameters({"City", "State"})
        @Test (priority = 2,invocationCount = 2)
        public void test1(String city, String state) {
            System.out.println(city);
            System.out.println(state);
        }


    }
