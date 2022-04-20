package com.test.etsy.test;

import com.test.etsy.EtsyTestBase;
import com.test.etsy.pages.MainPageEtsy;
import com.test.orangehrm.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMainPage extends EtsyTestBase {

    @Parameters("product")
    @Test
    public void EtsySearchTest(String product) throws InterruptedException {
        MainPageEtsy etsyMainPage = new MainPageEtsy(driver);
        etsyMainPage.searchItem(product);
        Thread.sleep(8000);
        Assert.assertTrue(etsyMainPage.validateHeader());
    }










}
