package com.example.SeleniumSpringboot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage{
    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement lnkLogin;
    public void clickOnLoginLnk(){
        lnkLogin.click();
    }
}
