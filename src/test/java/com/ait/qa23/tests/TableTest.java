package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp"); //sajti
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //dast 10 sec wremeni schtobi sajt uspel sagrusitsa, a potom test
    }

    @Test
    public void tableTest() {
        List<WebElement> elements = driver.findElements(By.cssSelector("table"));
        System.out.println(elements.size()); //5  rasmer

        WebElement element = driver.findElement(By.cssSelector("tr:nth-child(7) td:nth-child(3)"));
        System.out.println(element.getText()); //Germany   slowo

        //   " //h1/parent::* "  - najti roditela
        //   " //h1/parent::div "  - najti roditela
        //   " //h1/..           - korotkaja sapis

        //xpath

        //ancestor - predki
        //     //h1/ancestor::*  - wso schto nachoditsa nawerchu
        //     //h1/ancestor::div   - (neskolko divow kotorie eo roditeli)
        //     //h1/ancestor::div[2]   - (2 roditelskij div)

        //following-sibling
        //  //h1/following-sibling::a - sledujuschie sa nim sledujuschie bratja i sestri s attr a

        //preceding-sibling
        //  //a[@href='/login']/preceding-sibling::h1
        //  //a[@href='/login']/preceding-sibling::a

    }
}
