package com.example.SeleniumSpringboot.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class WebDriverWaitConfig {
    @Value("${timeout:30}")
    private int timeOut;
    @Bean
    public WebDriverWait waitFor(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    }
}
