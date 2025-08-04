package com.ait.homeworkFirstSeleniumProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    String email = "rosaliaw1@de.com";
    String password = "Qwert09_poi";

    @BeforeMethod
    public void precondition() {
        login(email, password);
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }

    @Test
    public void testAfterLogin() {
        // тут уже користувач залогінений
        System.out.println("Виконуємо тест після логіну...");
        // можеш додати дії після входу, наприклад:
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/customer/info']")));
    }
}
