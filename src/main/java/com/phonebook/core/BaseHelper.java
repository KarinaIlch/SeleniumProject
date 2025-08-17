package com.phonebook.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {

    protected WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0; // возвращает любой element
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

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
