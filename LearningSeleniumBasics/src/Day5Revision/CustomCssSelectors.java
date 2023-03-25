package Day5Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CustomCssSelectors {
    public static void main(String[] args) {
        //========================ID==========================
        //https://naveenautomationlabs.com/opencart/index.php?route=account/register
        // 1. Id in CSS ++> #id
        //  #input-firstname
        // 2. tagName#id
        //  input#input-firstname

        // ============================Class===================
        // 1. Class in CSS ++> .classValue
        //   .form-control
        // 2. tagName.classValue

        //=========================Multiple Classes================
        //https://app.hubspot.com/login
        // .c1.c2.c3.......cn (c means class value)(check the below code)
        // .form-control,private-form__control.login-email (email text box css path)
        // tagName.c1.c2.c3.....cn
        // input.form-control,private-form__control.login-email

        //Selected class values
        // .c1.c2.c3......cn ==> .c1.c3.c4
        // .form-control.private-form__control
        // input.login-email

        //  manage order as per your choice
        //  .c2.c4.c1
        // .login-email.form-control.private-form__control

        //==========================================
        // Can we combine id and class together
        // #id.class
        // #username.form-control.private-form__control.login-email
        // #username.login-email
        // tagName#id.class
        // input#username.login-email

        // .class#id
        // .login-email#username
        // tagName.class#id
        // input.login-email#username

        // identify webElement using css without class or id [ by using other available attributes ]
        // tagName[attribute='value']
        // input[type='email']

        // Multiple attributes
        // tagName[attribute1='value1'][attribute2='value2'][attribute3='value3']........[attributeN='valueN']
        // input[name='firstname'][type='text'][id='input-firstname']

        // can we use id or class with other attributes
        // #id[attribute='value']
            // #input-firstname[name='firstname']

        // .class[attribute='value']
            // .form-control[name='firstname']
        // tagName#id[attribute='value']
            //input#input-firstname[name='firstname']
        // tagName.class[attribute='value']
            // input.form-control[name='firstname']

        // can we use text in css to create CSS locator
        // 1. Text is not supported in CSS

        // contain in CSS
        // tagName[attribute*='attributeValue']
        // input[name*='firstname']
        // input[name*'name']
        // input[name*='first']

        // starts with in CSS
        // tagName[attribute^='attributeValue']
        // input[name^='first']

        // ends with
        //  tagName[attribute$='attributeValue']
        // input[name$='me']

        // parent-child
        // you can go parent to child but you can not go child to parent
        // parentTagName childTagName
        // div[class='private-form__input-wrapper'] input[id='username']
        // select#Form_getForm_Country option

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");


    }

}
