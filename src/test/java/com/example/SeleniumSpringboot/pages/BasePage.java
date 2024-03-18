package com.example.SeleniumSpringboot.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class BasePage {
    @Autowired
    WebDriver driver;
    @Value("${appURL}")
    String appURL;
    @PostConstruct
    public void init(){
        PageFactory.initElements(driver,this);
    }
}
