package com.ait.homework1;

import com.ait.homework1.core.TestBases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBases {

        @BeforeMethod
        public void precondition() {
            app.getUser().clickOnTheLogInButton();
            app.getUser().clickOnTheEmailDueLogin();
            app.getUser().clickOnThePassword();
            app.getUser().clickOnTheRememberMeButton();
            app.getUser().clickOnTheLoginButton();
        }

        @Test
         public void addItemToCartTest() {
            String itemName = app.getItem().getItemTitle();
            app.getItem().clickOnProduct("3");
            app.getNavi().pause(2000);
            app.getItem().clickOnTheAddToTheCart();
            Assert.assertTrue(app.getItem().assertCheckItemInCart(itemName));
        }

}
