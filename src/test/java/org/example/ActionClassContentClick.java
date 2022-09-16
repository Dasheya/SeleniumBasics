package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ActionClassContentClick {
    //ContextClick does not work on firefox browser - pls do it on chromebrowser
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Properties class uses properties file in this way we can use property file

        //enter the url
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(155, TimeUnit.SECONDS);
//find the Facebook link
        WebElement login = driver.findElement(By.cssSelector("button[name='login']"));

//right click (context click) on Login
        Actions actions = new Actions(driver);
        actions.contextClick(login).perform();
        Thread.sleep(5222);

//quit() method closes all the browsers opened by Selenium
        driver.quit();
    }
    }



