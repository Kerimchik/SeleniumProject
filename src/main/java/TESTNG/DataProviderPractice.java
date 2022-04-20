package TESTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

//    @DataProvider(name="FullNameTest")
//    //multidimensional array we use in Dataprovider
//    public Object[][] getData(){
//        return new Object[][] {
//                {"ahmet","baldir","ahmet baldir"},
//                {"aikerim","bragim" ,"aikerim bragim"},
//                {"vera","ann","vera ann"},
//                {"aizhan","gim", "aizhan gim"},
//                {"max","pop", "max pop"},
//                {"george","bondir", "george bondir"}
//
//
//
//        };
//    }




    @Test(dataProvider = "FullNameTest", dataProviderClass = DataForNames.class)
    public void test1(String username, String lastname, String expectedfullName){
        String userName =username;
        String lastName =lastname;
        String fullName =  userName + " "+ lastName;
        Assert.assertEquals(fullName, expectedfullName);
    }

//
//    @Test
//    public void test(){
//
//        String userName ="ahmet";
//        String lastName ="baldir";
//        String fullName = userName + " "+ lastName;
//        Assert.assertEquals(fullName, "ahmet baldir");
//    }
//



//    @Test
//    public void test2(){
//
//        String userName ="aikerim";
//        String lastName ="bragim";
//        String fullName = userName + " "+ lastName;
//        Assert.assertEquals(fullName, "aikerim bragim");
//    }
//    @Test
//    public void test3(){
//
//        String userName ="vera";
//        String lastName ="ann";
//        String fullName = userName + " "+ lastName;
//        Assert.assertEquals(fullName, "vera ann");
//    }

//
//    @Test
//    public void test4(){
//
//        String userName ="aizhan";
//        String lastName ="gim";
//        String fullName = userName + " "+ lastName;
//        Assert.assertEquals(fullName, "aizhan gim");
//    }



//    @Test
//    public void test5(){
//
//        String userName ="max";
//        String lastName ="pop";
//        String fullName = userName + " "+ lastName;
//        Assert.assertEquals(fullName, "max pop");
//    }








}
