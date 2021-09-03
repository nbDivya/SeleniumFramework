package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {

        public static WebElement UserName(WebDriver driver){
          return  driver.findElement(By.name("username"));
        }

        public static WebElement password(WebDriver driver){
            return driver.findElement(By.name("password"));

        }
        public static WebElement loginButton(WebDriver driver){
            return driver.findElement(By.xpath("//*[@id='loginfrm']/button"));



        }

    }


