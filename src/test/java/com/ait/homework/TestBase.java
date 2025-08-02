package com.ait.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod(enabled = false)
    public void tearDown() {

        driver.quit();
    }

    @Test
    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0; // возвращает любой element
    }

        public String newEmail() {
        int i =(int) (System.currentTimeMillis()/1000%3600);
        String email = "manuel" + i + "@gmail.com";
        return email;
    }}


