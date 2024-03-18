package com.example.SeleniumSpringboot.tests;

import com.example.SeleniumSpringboot.pages.HomePage;
import com.example.SeleniumSpringboot.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

public class demoTest2 extends SpringBaseTestNGTest {
    @Value("${email}")
    String Email;
    @Value("${password}")
    String password;
    @Autowired
    LoginPage loginPage;
    @Autowired
    HomePage homePage;

    @Test
    public void test_001() throws InterruptedException {
        loginPage.navigateToApp();
        homePage.clickOnLoginLnk();
        loginPage.enterLoginInfo(Email,password).clickOnLogin();
    }
}
