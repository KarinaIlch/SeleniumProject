package com.ait.homework1;

import org.testng.annotations.Test;

public class CreateAccountTests extends TestBases {

    @Test
    public void newUserRegistrationPositiveTest() {

        clickOnTheRegister();
        clickOnTheGender();
        clickOnTheFirstName();
        clickOnTheLastName();
        clickOnTheEmail();
        clickOnThePassword();
        clickOnThePasswordConfirmation();
        clickOnTheRegisterButton();
        assertCheckTheLogOutButton();

    }

    @Test
    public void UserLoginPositiveTest() {
        clickOnTheLogInButton();
        clickOnTheEmailDueLogin();
        clickOnThePasswordDueLogin();
        clickOnTheRememberMeDueLogin();
        clickOnTheLoginButtonDueLogin();

    }

}