package com.phonebook.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseHelper {

   protected WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public String newEmail() {
        int i =(int) (System.currentTimeMillis()/1000%3600);
        String email = "manuel" + i + "@gmail.com";
        return email;
    }
    @Test
    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0; // возвращает любой element
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
