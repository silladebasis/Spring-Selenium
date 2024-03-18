package com.example.SeleniumSpringboot.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class WebDriverConfig {
    @Bean
    @ConditionalOnProperty(name = "browser",havingValue = "chrome")

    public WebDriver chromeDriver(){
        return new ChromeDriver();
    }
    @Bean
    @ConditionalOnProperty(name = "browser",havingValue = "firefox")
    //@Primary
    public WebDriver firefoxDriver(){
        return new FirefoxDriver();
    }
}
