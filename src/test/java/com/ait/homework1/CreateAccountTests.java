package com.ait.homework1;

import com.ait.homework1.core.TestBases;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBases {

    @Test
    public void newUserRegistrationPositiveTest() {

        app.getUser().clickOnTheRegister();
        app.getUser().clickOnTheGender();
        app.getUser().clickOnTheFirstName();
        app.getUser().clickOnTheLastName();
        app.getUser().clickOnTheEmail();
        app.getUser().clickOnThePassword();
        app.getUser().clickOnThePasswordConfirmation();
        app.getUser().clickOnTheRegisterButton();
        app.getNavi().assertCheckTheLogOutButton();

    }

    @Test
    public void UserLoginPositiveTest() {
        app.getUser().clickOnTheLogInButton();
        app.getUser().clickOnTheEmailDueLogin();
        app.getUser().clickOnThePassword();
        app.getUser().clickOnTheRememberMeDueLogin();
        app.getUser().clickOnTheLoginButtonDueLogin();

    }

}