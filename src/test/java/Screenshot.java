import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

/* try {
FileHandler.copy(srcFile, new File("screenshot/" + System.currentTimeMillis() + "capture.png"));
} catch (IOException e) {
throw new RuntimeException(e);
}
*/
        try {
            FileUtils.copyFile(srcFile, new File("Screenshot/" + System.currentTimeMillis() + "_capture.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}