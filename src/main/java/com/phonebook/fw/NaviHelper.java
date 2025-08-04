package com.phonebook.fw;

import com.phonebook.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NaviHelper extends BaseHelper {
    public NaviHelper(WebDriver driver) {
        super(driver);
    }

    public void assertCheckTheLogOutButton() {
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }
}
