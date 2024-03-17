package com.example.SeleniumSpringboot.tests;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

public class demoTest extends SpringBaseTestNGTest {
    @Autowired
    protected WebDriver driver;
    @Value("${appURL:https://demowebshop.tricentis.com/}")
    String appURL;
    @Test
    public void test_001(){
        driver.get(appURL);
        driver.manage().window().maximize();
        //driver.findElement()
    }
}
