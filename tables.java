package org.testleaf.SeleniumLearing_VSCode.Week5;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

    public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://leafground.com/table.xhtml");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //Row count
    List<WebElement> rowFile = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
    int rowCount = rowFile.size();
    System.out.println("Row count is " + rowCount);

    //Column Count
    List<WebElement> colFile = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
    int colCount = colFile.size();
    System.out.println("Column count is "+colCount);
    

    //Total row & column count
    for (int i=0;i<colCount;i++){
    String col = colFile.get(i).getText();
    System.out.println("Column text is "+col);
    }
    for (int i=0;i<rowCount;i++){
    String row = rowFile.get(i).getText();
    System.out.println("Row text is "+row);
    }
    driver.close();
}
}
 