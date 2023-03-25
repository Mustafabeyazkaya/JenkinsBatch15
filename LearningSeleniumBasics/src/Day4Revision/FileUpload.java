package Day4Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        Thread.sleep(2000);
        WebElement chooseBtn=driver.findElement(By.xpath("//input[@multiple]"));

        chooseBtn.sendKeys("C:/Users/mbeya/OneDrive/Desktop/New Text Document.txt");// when ever you are dealing with a choose file button you need to sendKeys which is path of the file that you want to upload to website


    }
}
