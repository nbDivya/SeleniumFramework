package SeleniumInterviewPreparation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com/?.intl=us");
        Thread.sleep(3000);

        //driver.findElement(By.id("login-username")).sendKeys("divibskrn@yahoo.com");
        //driver.findElement(By.id("login-signin")).click();

        //driver.findElement(By.name("username")).sendKeys("divibskrn@yahoo.com");
        //driver.findElement(By.name("signin")).click();

        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("divibskrn@yahoo.com");
        //driver.findElement(By.xpath("//input[@id='login-signin']")).click();

//driver.findElement(By.linkText("Forgot username?")).click();
//driver.findElement(By.partialLinkText("Forgot")).click();
//driver.findElement(By.cssSelector("#login-username")).sendKeys("divibskrn@yahoo.com");
//driver.findElement(By.cssSelector("#login-signin")).click();


//driver.findElement(By.className("phone-no")).sendKeys("divibskrn@yahoo.com");

List<WebElement> Linklist= driver.findElements(By.tagName("a"));
        System.out.println("size"+Linklist.size());
        for(int i=0;i<Linklist.size();i++)
        {
            String linktext=Linklist.get(i).getText();
            System.out.println(linktext);

        }


    }

}
