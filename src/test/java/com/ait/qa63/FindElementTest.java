package com.ait.qa63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTest {

    WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://ilcarro.web.app");
            // maximize browser to window
            driver.manage().window().maximize();
            //  driver.manage().window().setSize(new Dimension(450,450));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @Test
        public void findElementByTagName() {
            //find -> "h1"

            //driver.findElement(By.tagName("h1"));
            WebElement title = driver.findElement(By.tagName("h1"));
            System.out.println(title.getText());

            //find -> "h2"
            WebElement element = driver.findElement(By.tagName("h2"));
            System.out.println(element.getText());

            //find -> "a" (result - empty field)
            WebElement link = driver.findElement(By.tagName("a"));
            System.out.println(link.getText());

            //find -> tagName "label" and show a list
            WebElement label = driver.findElement(By.tagName("label"));
            System.out.println(label.getText());

            List<WebElement> labels = driver.findElements(By.tagName("label"));
            System.out.println(labels.size());

            //find -> tagName "a"
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println(links.size());
        }

        @Test
        public void findElementById() {
            WebElement element = driver.findElement(By.id("city"));
            System.out.println(element.isDisplayed());
            List<WebElement> ids = driver.findElements(By.id("city"));
            System.out.println(ids.size());
            driver.findElement(By.id("dates"));
        }

        @Test
        public void findElementByClassName() {
            WebElement telephone = driver.findElement(By.className("telephone"));
            System.out.println("telephone = " + telephone.getText());
            WebElement navLink = driver.findElement(By.className("navigation-link"));
            System.out.println("navLink = " + navLink.getDomAttribute("class"));
        }

        @Test
        public void findByLinkText() {
            WebElement linkText = driver.findElement(By.linkText("Let the car work"));
            System.out.println(linkText.getText());

            WebElement element = driver.findElement(By.linkText("Los Angeles"));
            System.out.println("element = " + element.getText());

        }
        @Test
        public void findByPartialLinkText(){
            WebElement element1 = driver.findElement(By.partialLinkText("Los"));
            System.out.println("element = " + element1.getText());
        }

        @Test
        public void findElementsByCssSelector(){
            // driver.findElement(By.tagName("h1"));
            // tagName "h1" -> "h1"
            driver.findElement(By.cssSelector("h1"));
            driver.findElement(By.cssSelector("h2"));

            // id = "city" -> "#city"
            driver.findElement(By.cssSelector("#city"));
            driver.findElement(By.cssSelector("#dates"));

            // className "telephone" -> ".telephone"
            driver.findElement(By.cssSelector(".telephone"));
            driver.findElement(By.cssSelector(".navigation-link"));

            // pair selectors
            driver.findElement(By.cssSelector("[href='/search']"));
            driver.findElement(By.cssSelector("[href='/let-car-work']"));

            // contains -> * (поиск по сокращённому)
            driver.findElement(By.cssSelector("[href*='/reg']"));
            driver.findElement(By.cssSelector("[class*='offers']"));

            // start -> ^ с чего начинается локатор
            driver.findElement(By.cssSelector("[href^='/ter']"));
            driver.findElement(By.cssSelector("[class^='red']"));

            // end to -> $
            driver.findElement(By.cssSelector("[href$='-work']"));
            driver.findElement(By.cssSelector("[class$='cities']"));

            // composite  cssSelector > (чтобы достучаться до компонента ниже)
            driver.findElement(By.cssSelector(".logo>img")); // one step above
            driver.findElement(By.cssSelector(".input-container [formcontrolname='city']")); // space two or more steps above

            // tag or class or <id>:nth-child(n)
            WebElement elem = driver.findElement(By.cssSelector(".navigation-link:nth-child(6)"));
            System.out.println("elem = " + elem.getText());

        }

        @AfterMethod
        public void quit() {
            driver.quit();
        }

    }

