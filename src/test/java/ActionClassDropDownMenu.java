import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDropDownMenu {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
            driver.get("http://www.actimind.com/");
//find the menu "About Company"
            String xp = "//span[.='c-arrow c-toggler']";
            WebElement menu = driver.findElement(By.xpath(xp));
//mouse hover on "About Company" menu
            Actions actions = new Actions(driver);
            actions.moveToElement(menu).perform();
//click on submenu "Basic Facts"
            WebElement submenu = driver.findElement(By.linkText("Basic Facts"));
            submenu.click();
        }
    }