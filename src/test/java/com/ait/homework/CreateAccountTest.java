package com.ait.homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {


    @Test
    public void newUserRegistrationPositiveTest() {

        // click on the register in header
        driver.findElement(By.cssSelector("[href='/register']")).click();

        // click on the gender -> female
        driver.findElement(By.cssSelector("#gender-female")).click();

        // click on the 'First name' and fill the field
        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Rosalia");

        // click on the 'Last name' and fill the field
        driver.findElement(By.id("LastName")).click();
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Williams");

        // click on the 'email' and fill the field
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(newEmail());

        // click on the 'password' and fill the field
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("Qwert09_poi");

        // click on the 'confirm password' and fill the field
        driver.findElement(By.id("ConfirmPassword")).click();
        driver.findElement(By.id("ConfirmPassword")).clear();
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Qwert09_poi");

        // click on`Register`button
        driver.findElement(By.id("register-button")).click();

        // assert 'Log Out' button
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));

    }
    @Test
        public void UserLoginPositiveTest() {
        driver.findElement(By.cssSelector("[href='/login']")).click();

        // click on the 'email' and fill the field
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("rosaliaw1@de.com");

        // click on the 'password' and fill the field
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("Qwert09_poi");

        // click on 'RememberMe'
        driver.findElement(By.id("RememberMe")).click();

        // click on`Login`button
        driver.findElement(By.className("login-button")).click();

    }
    }
