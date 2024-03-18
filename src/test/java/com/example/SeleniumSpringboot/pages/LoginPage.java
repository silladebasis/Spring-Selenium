package com.example.SeleniumSpringboot.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {
    @FindBy(id = "Email")
    private WebElement txtEmail;
    @FindBy(id = "Password")
    private WebElement txtPassword;
    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement btnLogin;

    public LoginPage navigateToApp(){
        driver.get(appURL);
        driver.manage().window().maximize();
        return this;
    }

    public LoginPage enterLoginInfo(String email, String pass){
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(pass);
        return this;
    }
    public LoginPage clickOnLogin(){
        btnLogin.click();
        return this;
    }

}
