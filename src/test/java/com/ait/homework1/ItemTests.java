package com.ait.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBases {

        @BeforeMethod
        public void precondition() {
            click1(By.cssSelector("[href='/login']"));
            type1(By.id("Email"), "rosaliaw1@de.com");
            type1(By.id("Password"), "Qwert09_poi");
            click1(By.id("RememberMe"));
            click1(By.className("login-button"));
        }

        @Test
    public void addItemToCartTest() {
            //click on the second product button Add to cart;
            WebElement laptopLink = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']"));
            laptopLink.click();

            //click on the Shopping cart link in the header;
            WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-button-31"));
            addToCartBtn.click();

            //check the product added to the cart by its name;
            Assert.assertTrue(isElementPresent(By.xpath("//a[text()='14.1-inch Laptop']")));

        }

}
