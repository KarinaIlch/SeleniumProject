package com.ait.homework1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBases {
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
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type1(By locator1, String text1) {
        driver.findElement(locator1).click();
        driver.findElement(locator1).clear();
        driver.findElement(locator1).sendKeys(text1);
    }

    public void click1(By locator1) {
        driver.findElement(locator1).click();
    }
}

