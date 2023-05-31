package Day6Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HandlingDragAndDrop {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement sourceCapital=driver.findElement(By.xpath("//div[text()='Rome'and @id='box6']"));
        WebElement sourceCountry=driver.findElement(By.xpath("//div[text()='Italy'and @id='box106']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(sourceCapital,sourceCountry).perform();
    }
}
