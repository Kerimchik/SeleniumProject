package TESTNG;

import org.testng.annotations.DataProvider;

public class DataForNames {

    @DataProvider(name="FullNameTest")
    //multidimensional array we use in Dataprovider
    public Object[][] getData(){
        return new Object[][] {
                {"ahmet","baldir","ahmet baldir"},
                {"aikerim","bragim" ,"aikerim bragim"},
                {"vera","ann","vera ann"},
                {"aizhan","gim", "aizhan gim"},
                {"max","pop", "max pop"},
                {"george","bondir", "george bondir"}



        };
    }




}
