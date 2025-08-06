package com.phonebook.fw;

import com.phonebook.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnProduct(String number) {
        click(By.cssSelector(".item-box:nth-child("+number+") .add-info .buttons input"));

//        WebElement laptopLink = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']"));
//        laptopLink.click();
    }

    public void clickOnTheAddToTheCart() {
        click(By.cssSelector("[href='/cart']"));

//        WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-button-31"));
//        addToCartBtn.click();
    }
    public boolean assertCheckItemInCart(String text) {
//        List<WebElement> contacts = driver.findElements(By.cssSelector(".item-box:nth-child(3) .add-info .buttons input"));
        List<WebElement> items = driver.findElements(By.cssSelector(".product-name"));
        for (WebElement element: items) {
            if (element.getText().equals(text)) return true;
        }
        return false;
    }
    public String getItemTitle() {
        WebElement item = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-box'][2]//h2[@class='product-title']/a"));
        String itemName = item.getText();
        System.out.println("item.getText() = " + item.getText());
        return itemName;
    }
}
