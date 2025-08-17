package com.ait.homework1;

import com.ait.homework1.core.TestBases;
import com.phonebook.data.DataUserLogin;
import com.phonebook.models.UserData;   // ← перевір, щоб пакет збігався
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBases {

    private UserData user;

    @BeforeMethod
    public void precondition() {
        // існуючий акаунт для логіну
        user = new UserData()
                .setEmail(DataUserLogin.EMAIL)
                .setPassword(DataUserLogin.PASSWORD);

        app.getUser().clickOnTheLogInButton();        // відкриваємо /login
        app.getUser().clickOnTheEmailDueLogin(user);  // вводимо email
        app.getUser().clickOnThePassword(user);       // вводимо пароль
        app.getUser().clickOnTheRememberMeDueLogin(); // чекбокс
        app.getUser().clickOnTheLoginButtonDueLogin();// логін
    }

    @Test
    public void addItemToCartTest() {
        String itemName = app.getItem().getItemTitle();
        app.getItem().clickOnProduct("3");
        app.getNavi().pause(2000); // за можливості заміни на явне очікування
        app.getItem().clickOnTheAddToTheCart();
        Assert.assertTrue(app.getItem().assertCheckItemInCart(itemName));
    }
}
