package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeworkFind10Elm {
    //Создать новый тестовый класс и найти 10 элементов на странице. Для этого создать два тестовых метода:
    //один будет искать элементы по cssSelector, а второй те же самые элементы, но по xPath.

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void find10ElmCssSelector() {
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".mobile-header"));
        driver.findElement(By.cssSelector("[href$='work']"));
        driver.findElement(By.cssSelector("[href^='/registration']"));
        driver.findElement(By.cssSelector("[href*='of']"));
        driver.findElement(By.cssSelector("#dates"));
        driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.cssSelector("[type= 'submit']"));
        driver.findElement(By.cssSelector(".logo"));
        driver.findElement(By.cssSelector(".input-label"));
    }

    @Test
    public void find10ElmXPath() {
        driver.findElement(By.xpath("//*[@class='header']"));
        driver.findElement(By.xpath("//*[@class='mobile-header']"));
        //driver.findElement(By.xpath("//*[@attr='work']"));
        //driver.findElement(By.xpath("//*[@attr='/registration']"));
        //driver.findElement(By.xpath("//*[@attr='of']"));
        driver.findElement(By.xpath("//input[@id='dates']"));
        driver.findElement(By.xpath("//input[@id='city']"));
        //driver.findElement(By.xpath("//input[@type='submit']"));
        driver.findElement(By.xpath("//*[@class='logo']"));
        driver.findElement(By.xpath("//*[@class='input-label']"));
        driver.findElement(By.xpath("//*[contains(.,'Find your car now!')]"));
    }
}
