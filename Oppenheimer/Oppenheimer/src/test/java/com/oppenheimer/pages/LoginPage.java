package com.oppenheimer.pages;

import com.oppenheimer.utill.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    @FindBy(id = "username-in")
    WebElement txtUsername;

    @FindBy(id = "password-in")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnSubmit;

    public void typeUsername(String username){
        txtUsername.sendKeys(username);
    }

    public void typePassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickLoginButton(){
        btnSubmit.click();
    }

    public void loginAsClark(String clarkUsername, String clarkPassword){
        txtUsername.sendKeys(clarkUsername);
        txtPassword.sendKeys(clarkPassword);
        btnSubmit.click();
    }

    public void loginAsBookKeeper(String bookKeeperUsername, String bookKeeperPassword){
        txtUsername.sendKeys(bookKeeperUsername);
        txtPassword.sendKeys(bookKeeperPassword);
        btnSubmit.click();
    }

}
