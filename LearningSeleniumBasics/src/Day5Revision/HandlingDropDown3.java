package Day5Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDropDown3 {// DO NOT RUN THIS CODE WEB PAGE IS NOT WORKING
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.hdfcbank.com/");

        WebElement productTypeDdl = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
        productTypeDdl.click();
        List<WebElement> productType = driver.findElements(By.xpath("//div[@class='dropdown open']//li"));

        for (WebElement product : productType) {
            String productName = product.getText();
            if (productName.equalsIgnoreCase("Loans")) {
                product.click();
                break;
            }
        }}
}
