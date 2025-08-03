package com.ait.homework1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBases {

        @BeforeMethod
        public void precondition() {
            clickOnTheLogInButton();
            clickOnTheEmailDueLogin();
            clickOnThePasswordDueLogin();
            clickOnTheRememberMeButton();
            clickOnTheLoginButton();
        }

        @Test
         public void addItemToCartTest() {
            clickOnTheSecondProduct();
            clickOnTheAddToTheCart();
            assertItemInCart();
        }

}
