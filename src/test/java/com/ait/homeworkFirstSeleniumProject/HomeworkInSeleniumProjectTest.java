package com.ait.homeworkFirstSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeworkInSeleniumProjectTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {
       WebElement heading = driver.findElement(By.tagName("h3"));
       System.out.println(heading.getText());

       List<WebElement> list = driver.findElements(By.tagName("a"));
       System.out.println(list.size());
    }

    @Test
    public void findElementById() {
       WebElement cart = driver.findElement(By.id("flyout-cart"));
       System.out.println(cart.isDisplayed());

       WebElement notification = driver.findElement(By.id("bar-notification"));
       System.out.println(notification.isDisplayed());
    }

    @Test
    public void findElementByClassName() {
       WebElement footer = driver.findElement(By.className("footer-poweredby"));
       System.out.println(footer.getText());

       WebElement footer1 = driver.findElement(By.className("footer-disclaimer"));
       System.out.println(footer1.getText());
    }

    @Test
    public void findElementLinkText() {
        WebElement linkText1 = driver.findElement(By.linkText("nopCommerce"));
        System.out.println(linkText1.getText());

        WebElement linkText2 = driver.findElement(By.linkText("My account"));
        System.out.println(linkText2.getText());
    }

    @Test
    public void findElementByCssSelector() {
        //tagName "h3" -> "h3"
        WebElement heading = driver.findElement(By.cssSelector("h3"));
        System.out.println(heading.getText());
        List<WebElement> list = driver.findElements(By.cssSelector("a"));
        System.out.println(list.size());

        // id -> #
        WebElement cart = driver.findElement(By.cssSelector("#flyout-cart"));
        System.out.println(cart.isDisplayed());
        WebElement notification = driver.findElement(By.cssSelector("#bar-notification"));
        System.out.println(notification.isDisplayed());

        // className "footer-poweredby" -> ".footer-poweredby"
        WebElement footer = driver.findElement(By.cssSelector(".footer-poweredby"));
        System.out.println(footer.getText());
        WebElement footer1 = driver.findElement(By.cssSelector(".footer-disclaimer"));
        System.out.println(footer1.getText());

        // linkText
        WebElement linkText1 = driver.findElement(By.linkText("nopCommerce"));
        System.out.println(linkText1.getText());
        WebElement linkText2 = driver.findElement(By.linkText("My account"));
        System.out.println(linkText2.getText());
    }

    @Test
    public void SccSelectorsAnother(){
       driver.findElement(By.cssSelector("[href='/register']"));
       driver.findElement(By.cssSelector("[href='/cart']"));
       driver.findElement(By.cssSelector("[type='text/javascript']"));

       // contain *
       driver.findElement(By.cssSelector("[rel*='shortcut']"));
       driver.findElement(By.cssSelector("[content*='initial-scale=1']"));

       // start ^
       driver.findElement(By.cssSelector("[href^='/Themes/DefaultClean/']"));

       // end to -> $
        driver.findElement(By.cssSelector("[href$='/Content/responsive.css']"));

        // composite cssSelector
        driver.findElement(By.cssSelector(".master-wrapper-content>.header"));

        // .class:nth-child(n)
        driver.findElement(By.cssSelector(".top-menu > li:nth-child(3)"));

    }

    @Test
    public void XPathTest(){
        // tag
        WebElement heading = driver.findElement(By.xpath("//h3"));
        System.out.println(heading.getText());

        List<WebElement> list = driver.findElements(By.xpath("//a"));
        System.out.println(list.size());

        // id
        WebElement cart = driver.findElement(By.xpath("//*[@id='flyout-cart']"));
        System.out.println(cart.isDisplayed());

        WebElement notification = driver.findElement(By.xpath("//*[@id='bar-notification']"));
        System.out.println(notification.isDisplayed());

        // class
        WebElement footer = driver.findElement(By.xpath("//*[@class='footer-poweredby']"));
        System.out.println(footer.getText());

        WebElement footer1 = driver.findElement(By.xpath("//*[@class='footer-disclaimer']"));
        System.out.println(footer1.getText());

        // link text
        WebElement linkText1 = driver.findElement(By.xpath("//*[text()='nopCommerce']"));
        System.out.println(linkText1.getText());

        WebElement linkText2 = driver.findElement(By.xpath("//*[text()='My account']"));
        System.out.println(linkText2.getText());

        // contain *
        driver.findElement(By.xpath("//*[contains(@rel,'shortcut')]"));
        driver.findElement(By.xpath("//*[contains(@content,'initial-scale=1')]"));

        // start ^
        driver.findElement(By.xpath("//*[starts-with(@href,'/Themes/DefaultClean/')]"));

        // composite cssSelector
        driver.findElement(By.xpath("//*[contains(@class,'master-wrapper-content')]/div[contains(@class,'header')]"));
    }

    @AfterMethod
    public void quit() {
        driver.quit();
}
}
