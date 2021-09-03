package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class updateProfileObject {
    public static WebElement myprofile(WebDriver driver) {

        return driver.findElement(By.xpath("//ul[@class='menu-vertical-01']/li[2]/a"));
    }

    public static WebElement city(WebDriver driver)
    {
        return driver.findElement(By.name("city"));

    }

    public static WebElement phone(WebDriver driver)
    {
        return driver.findElement(By.name("phone"));

    }

    public static WebElement submit(WebDriver driver)
    {
        return driver.findElement(By.xpath("//*[@id='profilefrm']/div/div/div[7]/div/button"));
    }
}

