package com.example.SeleniumSpringboot.tests;

import com.example.SeleniumSpringboot.configs.WebDriverWaitConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
@SpringBootTest
public class SpringBaseTestNGTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected WebDriver driver;
    @Autowired
    protected WebDriverWait wait;
}
