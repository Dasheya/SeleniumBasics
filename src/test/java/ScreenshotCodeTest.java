import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenshotCodeTest
{
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);

        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File srcfile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(srcfile,new File("screenshot/"+System.currentTimeMillis()+"Signup.png"));
        driver.quit();
    }
}
