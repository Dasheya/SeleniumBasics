package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions action = new Actions(driver);
//movetoElement - used for mouse hover
//Mouse hover on “AREAS OF EXPERTISE” menu
        WebElement Amazonicon = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
        action.moveToElement(Amazonicon).perform();
//Click on “AREAS OF EXPERTISE” menu
        WebElement cloudApp = driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span/span[2]/span[1]"));
        action.moveToElement(cloudApp).click().perform();
//composite multiple actions can be achieved using the below statement
//action.moveToElement(AreaOfExpertise).moveToElement(cloudApp).click().build().perform();
    }
}
