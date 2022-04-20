package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TESTINGAssertion {

    //create a method that takes two




    public double getMultiplication(double a, double b){
        return a*b;
    }

    @Test
    public void validateMultiplication(){
        double Actualresult = getMultiplication(5,6);
        double Expectedresult = 30;
        Assert.assertEquals(Actualresult,Expectedresult, "my numbers are 5 and 6"); //message shows up if it fails
    }


    public double getDivision(double s, double t){
        if(s>=t){
            return s/t;
        }
        return t/s;
    }


    public int substraction (int s, int t){
        if(s>=t){
            return s-t;
        }
        return t-s;
    }

    @Test
    public void validateDivision(){
        double Actualresult = getDivision(24,6);
        double Expectedresult = 4;
        Assert.assertEquals(Actualresult,Expectedresult, "my numbers are 24 and 6"); //message shows up if it fails
    }

//Positive Testing:
    @Test
    public void validateSubstraction(){
        int Actualresult = substraction(18,2);
        int Expectedresult = 16;
        Assert.assertEquals(Actualresult,Expectedresult, "my numbers are 18 and 2"); //message shows up if it fails
    }

//Positive Testing:
    @Test
    public void validateSubstraction2(){
        int Actualresult = substraction(2,18);
        int Expectedresult = 10;
        Assert.assertEquals(Actualresult,Expectedresult, "my numbers are 2 and 18"); //message shows up if it fails
    }


    @Test
    public void validateSubstraction12(){
        int Actualresult = substraction(2,18);
        int Expectedresult = 16;
        Assert.assertEquals(Actualresult,Expectedresult, "my numbers are 2 and 18"); //message shows up if it fails

        int Actualresult2 = substraction(30,18);
        int Expectedresult3 = 12;
        Assert.assertEquals(Actualresult2,Expectedresult3, "my numbers are 2 and 18"); //message shows up if it fails


    }





}
