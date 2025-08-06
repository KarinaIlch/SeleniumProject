package com.phonebook.core;

import com.phonebook.fw.ItemHelper;
import com.phonebook.fw.NaviHelper;
import com.phonebook.fw.UserHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ApplicationManager {

    WebDriver driver;

    UserHelper user;
    ItemHelper item;
    NaviHelper navi;

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        item = new ItemHelper(driver);
        navi = new NaviHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public ItemHelper getItem() {
        return item;
    }

    public NaviHelper getNavi() {
        return navi;
    }

}
