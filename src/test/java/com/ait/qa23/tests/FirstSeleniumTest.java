package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {

    WebDriver driver; //klass bibliotheki web driver

    //before - setUp  preduslowie
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();//nuschno obratitsa  escho suda dla raboti s chromedriverom
        options.addArguments("remote-allow-origins=*");//* osnatschaet dobawlat wsjo
        driver = new ChromeDriver(); //initialisirowali driver, esli problemi to moschno w skobkach (options) napisatj

        driver.get("https://telranedu.web.app/login"); // HISTORY otschischaetsa
        //driver.navigate().to("https://www.google.com");// WITH HISTORY

        //maximize browser window
        driver.manage().window().maximize(); //i snowa sapuskaem programmu
    }
    @Test //sapusk methoda
    public void FindElementByTagName() {
        System.out.println("Site opened!!!");

        //find element by tag
        WebElement element = driver.findElement(By.tagName("h1")); //alt+enter i on emu naswanie delaet
        System.out.println(element.getText()); //raspetschataetsa PHONEBOOK

        //find list of elements eto is List<Elements>
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size()); // 3 usnali skolko ich

        //find element by class name
        WebElement element1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));// nachodim na sajte class kotorij nuschen w console rasrabotschika
        System.out.println(element1.getText());//raspetschataet wse schto tam estj PHONEBOOK HOME ABOUT LOGIN

        //find element by name
        WebElement email = driver.findElement(By.name("email"));
        System.out.println(email.getText()); //tam pusto
    }

    //tests nasiwatj maoschem testi kak hotim, no tak schtobi ponatno bilo schto wi testiti

    //after - tearDown
    @AfterMethod
    public void tearDown() {
        driver.quit(); // programma sapustitsa i sakroetsa
        //driver.close();  // otlitschie w tom schto quit sakriwaet wsö a close sakriwaet tolko odnu tekuschuju wkladku
    }

}
