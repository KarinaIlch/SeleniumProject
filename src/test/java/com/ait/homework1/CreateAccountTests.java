package com.ait.homework1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBases {

    @Test
    public void newUserRegistrationPositiveTest() {

        // click on the register in header
        click(By.cssSelector("[href='/register']"));

        // click on the gender -> female
        click(By.cssSelector("#gender-female"));

        // click on the 'First name' and fill the field
        type(By.id("FirstName"), "Rosalia");

        // click on the 'Last name' and fill the field
        type(By.id("LastName"), "Williams");

        // click on the 'email' and fill the field
        type(By.id("Email"), newEmail());

        // click on the 'password' and fill the field
        type(By.id("Password"), "Qwert09_poi");

        // click on the 'confirm password' and fill the field
        type(By.id("ConfirmPassword"), "Qwert09_poi");

        // click on`Register`button
        click(By.id("register-button"));

        // assert 'Log Out' button
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));

    }

    @Test
    public void UserLoginPositiveTest() {
        click1(By.cssSelector("[href='/login']"));

        // click on the 'email' and fill the field
        type1(By.id("Email"), "rosaliaw1@de.com");

        // click on the 'password' and fill the field
        type1(By.id("Password"), "Qwert09_poi");

        // click on 'RememberMe'
        click1(By.id("RememberMe"));

        // click on`Login`button
        click1(By.className("login-button"));

    }

}