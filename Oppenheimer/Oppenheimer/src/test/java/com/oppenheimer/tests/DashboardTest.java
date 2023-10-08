package com.oppenheimer.tests;

import com.oppenheimer.pages.DashboardPage;
import com.oppenheimer.pages.LoginPage;
import com.oppenheimer.utill.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest extends TestBase {

    @Test (description = "AC1,AC2,AC3")
    public void userStory02(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.loginAsClark("clerk","clerk");

        DashboardPage dashboardPage = PageFactory.initElements(driver,DashboardPage.class);
        dashboardPage.clickAddAHeroButton();
        dashboardPage.clickUploadCsvButton();
        dashboardPage.uploadCsv("C:\\Users\\Pradeepa\\Desktop\\Govtech\\Oppenheimer\\Oppenheimer\\uploads\\test.xlsx");
        dashboardPage.clickOnCreateButton();
        Assert.assertEquals(dashboardPage.getMessage(),"Created Successfully!");
    }

    @Test (description = "AC1")
    public void userStory03(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.loginAsBookKeeper("bk","bk");

        DashboardPage dashboardPage = PageFactory.initElements(driver,DashboardPage.class);
        dashboardPage.clickTaxReliefButton();
    }

}
