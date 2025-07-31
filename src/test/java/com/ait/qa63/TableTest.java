package com.ait.qa63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class TableTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
    driver.get("https://www.w3schools.com/css/css_table.asp");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void  tableSccSelectorTest(){
        // get numbers of rows
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        for(int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
        }
        System.out.println("***************************");
        for(WebElement element: rows) {
            System.out.println(element.getText());
        }
        System.out.println("******************************");
    // get row 5
        WebElement austria = driver.findElement(By.cssSelector("tr:nth-child(5)"));
        System.out.println(austria.getText());
        System.out.println("********************************");

        // get row 3 with class
        WebElement peter = driver.findElement(By.cssSelector(".fullwidthtable tr:nth-child(2)"));
        System.out.println("********************************");

        // get row 5, last element
        WebElement austria1 = driver.findElement(By.cssSelector("tr:nth-child(5) td:nth-child(3)"));
        System.out.println(austria1.getText());
    }

    @Test
    public void findElementByXPath(){
        // driver.findElement(By.cssSelector("h1"));
        // driver.findElement(By.cssSelector("h2"));
        //h1 -> //h1
        driver.findElement(By.xpath("//h1"));
        driver.findElement(By.xpath("//h2"));
        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//input[@id='dates']"));

        // driver.findElement(By.cssSelector("telephone"));
        // driver.findElement(By.cssSelector("navigation-link"));
        // class -> //tag@class='value']
        driver.findElement(By.xpath("//*[@class='telephone']"));
        driver.findElement(By.xpath("//a[@class='navigation-link']"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }

    //XPath //tag'@attribute='parameter`]
    //         //tag[1]
    //         //tag[@attribute='parameter' and attribute2='parameter'2]
    // function() //tag[function]() = 'text']
// }


}

