import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragNDrop_offset {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
//write xpath for Block 1
        String xp1 = "//h1[.='Block 1']";
        WebElement block1 = driver.findElement(By.xpath(xp1));
//write xpath for Block 3
        String xp2 = "//h1[.='Block 3']";
        WebElement block3 = driver.findElement(By.xpath(xp2));
//Create an object of Actions class and pass driver object as an argument
        Actions actions = new Actions(driver);
        Thread.sleep(2555);
//call the dragAndDropBy() method of Actions class
        actions.dragAndDropBy(block1, block3.getLocation().getX()+10,
                block3.getSize().getHeight()+10).perform();
        Thread.sleep(4444);
        driver.close();
    }
}
