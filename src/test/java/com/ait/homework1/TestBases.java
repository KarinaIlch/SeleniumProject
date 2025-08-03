package com.ait.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBases {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod(enabled = false)
    public void tearDown() {

        driver.quit();
    }

    @Test
    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0; // возвращает любой element
    }

    public String newEmail() {
        int i =(int) (System.currentTimeMillis()/1000%3600);
        String email = "manuel" + i + "@gmail.com";
        return email;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type1(By locator1, String text1) {
        driver.findElement(locator1).click();
        driver.findElement(locator1).clear();
        driver.findElement(locator1).sendKeys(text1);
    }

    public void click1(By locator1) {
        driver.findElement(locator1).click();
    }

    public void assertCheckTheLogOutButton() {
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }

    public void clickOnTheRegisterButton() {
        click(By.id("register-button"));
    }

    public void clickOnThePasswordConfirmation() {
        type(By.id("ConfirmPassword"), "Qwert09_poi");
    }

    public void clickOnTheLoginButton() {
        click1(By.className("login-button"));
    }

    public void clickOnTheRememberMeButton() {
        click1(By.id("RememberMe"));
    }

    public void clickOnThePassword() {
        type(By.id("Password"), "Qwert09_poi");
    }

    public void clickOnTheEmail() {
        type(By.id("Email"), newEmail());
    }

    public void clickOnTheLastName() {
        type(By.id("LastName"), "Williams");
    }

    public void clickOnTheFirstName() {
        type(By.id("FirstName"), "Rosalia");
    }

    public void clickOnTheGender() {
        click(By.cssSelector("#gender-female"));
    }

    public void clickOnTheRegister() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnTheLoginButtonDueLogin() {
        driver.findElement(By.className("login-button")).click();
    }

    public void clickOnTheRememberMeDueLogin() {
        driver.findElement(By.id("RememberMe")).click();
    }

    public void clickOnThePasswordDueLogin() {
        type1(By.id("Password"), "Qwert09_poi");
    }

    public void clickOnTheEmailDueLogin() {
        type1(By.id("Email"), "rosaliaw1@de.com");
    }

    public void clickOnTheLogin() {
        click1(By.cssSelector("[href='/login']"));
    }

    public void clickOnTheLogInButton() {
        clickOnTheLogin();
    }

    public void assertItemInCart() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='14.1-inch Laptop']")));
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

