package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app"); //sajti
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //dast 10 sec wremeni schtobi sajt uspel sagrusitsa, a potom test
    }

    @Test
    public void findElementsByCssTest() {
        //id -> css(#)
        //driver.findElement.(By.id("city");
        driver.findElement(By.cssSelector("#city")); //wnutri skobok strategia, nawesti kursiw na input city i na prawuju knopku mischki

        //class -> css(.)
        //driver.findElement(By.className("header"));
        driver.findElement(By.cssSelector(".header"));

        //attribute _> css([])
        driver.findElement(By.cssSelector("[type= 'submit']"));
        //"[checked]" - nalitschie atributa
        //"[name=email]" - sowpadenie snatschenij
        //"[title*=Name]" - soderschit text
        //"[src^=http]" - natschinaetsa s texta
        //"[src$=.pdf]" - sakantschiwaetsa textom

        //contains -> *
        driver.findElement(By.cssSelector("[href*='car']")); //contains iskatj po slowu gde ugodno
        //start with -> ^
        driver.findElement(By.cssSelector("[href^='/let']")); //iskatj po tomu schto napisanno w natschale ssilki
        //end on -> $
        driver.findElement(By.cssSelector("[href$='work']")); //iskatj po tomu schto w konze ssilki href w konsole chrome

    }


    @Test
    public void findElementsByXpathTest() {
        //id -> xpath //*[@id='value']
        //driver.findElement.(By.id("city");
        driver.findElement(By.xpath("//*[@id='city']"));

        //class -> xpath //*[@class='value']
        //driver.findElement(By.className("header"));
        driver.findElement(By.xpath("//*[@class='header']"));

        //contains, end on, start -> //*[contains(.,'text)]
        driver.findElement(By.xpath("//*[contains(.,'Find your car now!')]"));  //contains eto method, moschno tak iskatj po slowu na sajte s takim sintaksisom
    }

    // *[@attr='name']  *iskatj wesde
}
