package org.testleaf.SeleniumLearing_VSCode.Week5;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
    driver.manage().window().maximize();
    driver.switchTo().frame("iframeResult");
    driver.findElement(By.xpath("//button[text()='Try it']")).click();
    Alert alert = driver.switchTo().alert();
    //alert.accept();
    alert.dismiss();
    WebElement resultAlert = driver.findElement(By.id("demo"));
    String finalresult = resultAlert.getText();
    if (finalresult.equals("You pressed OK!")) 
    {
    System.out.println("Text on Alert is: " + finalresult);
    } 
    else 
    {
    System.out.println("Text on Alert is: " + finalresult);
    }
    driver.quit();
}

}
