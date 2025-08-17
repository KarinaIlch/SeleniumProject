package com.phonebook.fw;

import com.phonebook.core.BaseHelper;
import com.phonebook.models.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    // --------- Registration ----------
    public void clickOnTheRegister() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnTheGender() {
        click(By.cssSelector("#gender-female"));
    }

    public void clickOnTheFirstName(UserData user) {
        type(By.id("FirstName"), user.getUserName());
    }

    public void clickOnTheLastName(UserData user) {
        type(By.id("LastName"), user.getUserLastName());
    }

    public void clickOnTheEmail(UserData user) {
        type(By.id("Email"), user.getEmail());
    }

    public void clickOnThePassword(UserData user) {
        type(By.id("Password"), user.getPassword());
    }

    public void clickOnThePasswordConfirmation(UserData user) {
        type(By.id("ConfirmPassword"), user.getPassword());
    }

    public void clickOnTheRegisterButton() {
        click(By.id("register-button"));
    }

    // --------- Login ----------
    public void clickOnTheLogin() {
        click1(By.cssSelector("[href='/login']"));
    }

    public void clickOnTheEmailDueLogin(UserData user) {
        type1(By.id("Email"), user.getEmail());
    }

    public void clickOnTheRememberMeDueLogin() {
        driver.findElement(By.id("RememberMe")).click();
    }

    public void clickOnTheLoginButtonDueLogin() {
        driver.findElement(By.className("login-button")).click();
    }

    public void clickOnTheLogInButton() {
        clickOnTheLogin();
    }

    }
