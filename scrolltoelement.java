package org.testleaf.SeleniumLearing_VSCode.Week5;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolltoelement {

    public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    WebElement ele = driver.findElement(By.linkText("Amazon Pay on Merchants"));
    Actions act = new Actions(driver);
    act.scrollToElement(ele).perform();
    ele.click();
    }
}