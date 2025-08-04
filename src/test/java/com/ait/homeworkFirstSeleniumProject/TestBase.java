package com.ait.homeworkFirstSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
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
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public String newEmail() {
        int i = (int) (System.currentTimeMillis() / 1000 % 3600);
        return "manuel" + i + "@gmail.com";
    }

    public void type(By locator, String text) {
        if (text != null) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    // ---------------------------
    // Login methods
    // ---------------------------

    public void clickOnTheLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void typeIntoLoginEmail(String email) {
        type(By.id("Email"), email);
    }

    public void typeIntoLoginPassword(String password) {
        type(By.id("Password"), password);
    }

    public void clickOnTheRememberMeCheckbox() {
        click(By.id("RememberMe"));
    }

    public void clickOnLoginButton() {
        click(By.className("login-button"));
    }
    public void login(String email, String password) {
        clickOnTheLoginLink();
        typeIntoLoginEmail(email);
        typeIntoLoginPassword(password);
        clickOnTheRememberMeCheckbox();
        clickOnLoginButton();
    }

    // ---------------------------
    //  Registration methods
    // ---------------------------

    public void clickOnTheRegisterInHeader() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnTheGender() {
        click(By.cssSelector("#gender-female"));
    }

    public void clickOnTheFirstNameRegistration() {
        type(By.id("FirstName"), "Rosalia");
    }

    public void clickOnTheLastNameRegistration() {
        type(By.id("LastName"), "Williams");
    }

    public void clickOnTheNewEmailRegistration() {
        type(By.id("Email"), newEmail());
    }

    public void clickOnThePasswordRegistration() {
        type(By.id("Password"), "Qwert09_poi");
    }

    public void clickOnTheConfirmPasswordRegistration() {
        type(By.id("ConfirmPassword"), "Qwert09_poi");
    }

    public void clickOnTheRegisterButtonRegistration() {
        click(By.id("register-button"));
    }

    @Test
    public void newUserRegistrationPositiveTest() {
        clickOnTheRegisterInHeader();
        clickOnTheGender();
        clickOnTheFirstNameRegistration();
        clickOnTheLastNameRegistration();
        clickOnTheNewEmailRegistration();
        clickOnThePasswordRegistration();
        clickOnTheConfirmPasswordRegistration();
        clickOnTheRegisterButtonRegistration();
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }
}
