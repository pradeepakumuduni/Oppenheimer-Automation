package com.oppenheimer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

    @FindBy(id = "dropdownMenuButton2")
    WebElement btnAddAHero;

    @FindBy(linkText = "Upload a csv file")
    WebElement lnkUploadACsv;

    @FindBy(id = "upload-csv-file")
    WebElement btnChooseFile;

    @FindBy(xpath = "//button[@Class='btn btn-primary']")
    WebElement btnCreate;

    @FindBy(xpath = "//div[@class='bg-warning pt-2']//h3")
    WebElement message;

    @FindBy(id = "tax_relief_btn")
    WebElement btnTaxRelief;

    public void clickAddAHeroButton(){
        btnAddAHero.click();
    }

    public void clickUploadCsvButton(){
        lnkUploadACsv.click();
    }

    public void uploadCsv(String csvFilePath){
        btnChooseFile.sendKeys(csvFilePath);
    }

    public void clickOnCreateButton(){
        btnCreate.click();
    }

    public String getMessage(){
        return message.getText();
    }

    public void clickTaxReliefButton(){
        btnTaxRelief.click();
    }

}
