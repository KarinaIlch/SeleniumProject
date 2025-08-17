package com.ait.homework1;

import com.ait.homework1.core.TestBases;
import com.phonebook.data.DataUserLogin;
import com.phonebook.models.UserData;
import com.phonebook.utils.MyDataProvider;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBases {

    @Test
    public void newUserRegistrationPositiveTest() {
        UserData user = new UserData()
                .setUserName("Rosalia")
                .setUserLastName("Williams")
                .setEmail(DataUserLogin.newEmail())   // ← тут виклик методу
                .setPassword(DataUserLogin.PASSWORD);

        app.getUser().clickOnTheRegister();
        app.getUser().clickOnTheGender();
        app.getUser().clickOnTheFirstName(user);          // ← передаємо user
        app.getUser().clickOnTheLastName(user);
        app.getUser().clickOnTheEmail(user);
        app.getUser().clickOnThePassword(user);
        app.getUser().clickOnThePasswordConfirmation(user);
        app.getUser().clickOnTheRegisterButton();
        app.getNavi().assertCheckTheLogOutButton();
    }

    @Test(dataProviderClass = MyDataProvider.class, dataProvider = "addNewUser")
    public void registrationTestWithDataProvider(String name, String lastname, String password, String email) {
        UserData anotherUser = new UserData()
                .setUserName(name)
                .setUserLastName(lastname)
                .setPassword(password)
                .setEmail(email);

        app.getUser().clickOnTheRegister();
        app.getUser().clickOnTheGender();
        app.getUser().clickOnTheFirstName(anotherUser);          // ← передаємо user
        app.getUser().clickOnTheLastName(anotherUser);
        app.getUser().clickOnTheEmail(anotherUser);
        app.getUser().clickOnThePassword(anotherUser);
        app.getUser().clickOnThePasswordConfirmation(anotherUser);
        app.getUser().clickOnTheRegisterButton();
        app.getNavi().assertCheckTheLogOutButton();

    }

    @Test
    public void UserLoginPositiveTest() {
        UserData user = new UserData()
                .setEmail(DataUserLogin.EMAIL)
                .setPassword(DataUserLogin.PASSWORD);

        app.getUser().clickOnTheLogInButton();           // відкриваємо /login
        app.getUser().clickOnTheEmailDueLogin(user);     // вводимо email
        app.getUser().clickOnThePassword(user);          // вводимо пароль (той самий locator #Password)
        app.getUser().clickOnTheRememberMeDueLogin();
        app.getUser().clickOnTheLoginButtonDueLogin();

    }
    }