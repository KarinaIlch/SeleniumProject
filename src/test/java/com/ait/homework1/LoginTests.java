package com.ait.homework1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends TestBases {

    @Test
    public void loginPositiveTest() {
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
