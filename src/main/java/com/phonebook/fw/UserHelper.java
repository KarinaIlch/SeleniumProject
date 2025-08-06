package com.phonebook.fw;

import com.phonebook.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
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

//    public void clickOnThePasswordDueLogin() { type1(By.id("Password"), "Qwert09_poi");}

    public void clickOnTheEmailDueLogin() {
        type1(By.id("Email"), "rosaliaw1@de.com");
    }

    public void clickOnTheLogin() {
        click1(By.cssSelector("[href='/login']"));
    }

    public void clickOnTheLogInButton() {
        clickOnTheLogin();
    }
}
