package com.phonebook.fw;

import com.phonebook.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnTheAddToTheCart() {
        WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-button-31"));
        addToCartBtn.click();
    }

    public void clickOnTheSecondProduct() {
        WebElement laptopLink = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']"));
        laptopLink.click();
    }
}
