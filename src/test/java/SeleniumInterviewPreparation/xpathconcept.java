package SeleniumInterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathconcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");


        //driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

        //driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");

        //driver.findElement(By.xpath("//a[text()='orangeHRM , Inc']"));

        // driver.findElement(By.xpath("//input[@name='txtUsername'][@id='txtUsername'][@type='text']")).sendKeys("Admin");

       // driver.findElement(By.xpath("//a[contains(@href,'orange')]"));


        //parent Element

        driver.findElement(By.xpath("//*[@id='divUsername')]/parent::form"));
        //This concept type in inspect place(ie) ctrl+f

    }
}
