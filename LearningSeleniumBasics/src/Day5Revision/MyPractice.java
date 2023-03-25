package Day5Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyPractice {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327669&hvpos=&hvnetw=s&hvrand=144243421219151037&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9008452&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845437");
        WebElement allBtn = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select select=new Select(allBtn);
        List<WebElement> options=select.getOptions();
        for (WebElement option:options) {
            String text=option.getText();
            if (text.equalsIgnoreCase("Baby")){
                option.click();
            }
        }
    }
}
