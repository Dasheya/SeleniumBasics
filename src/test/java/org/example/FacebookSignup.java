package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup
{

    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","D://Selenium/chromedriver.exe");
        //WebDriver driver=new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        System.out.println("Get Title"+driver.getTitle());
        System.out.println("Get Current Url"+driver.getCurrentUrl());
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("Darshan");
        driver.findElement(By.cssSelector("input[aria-label='Surname']")).sendKeys("Thorat");
        driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("darshaanthorat@yahoo.in");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("darshaanthorat@yahoo.in");
        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][@type='password']")).sendKeys("dkthorat17");


        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("18");
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Oct");
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1993");

        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(3000);
        driver.navigate().to("https://www.pexels.com/photo/thank-you-signage-2072165/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        String pageSource = driver.getPageSource();
        System.out.println("Get Page Source-"+pageSource);
        Thread.sleep(2000);
        //String myWindowHandle = driver.getWindowHandle();
        //driver.switchTo().window(myWindowHandle );
        //driver.switchTo().fra;

        Thread.sleep(5000);
        driver.quit();
    }
}
