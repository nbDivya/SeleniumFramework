package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suiteExample {
    WebDriver driver;
    long startTime;
    long endTime;
    @BeforeSuite
    public void launchBrowser()
    {
        startTime=System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();

    }
    @Test
    public void openGoogle()
    {
        driver.get("https://www.google.com/");
    }
@Test
    public void openBing()
    {
        driver.get("https://www.bing.com/");
    }
@Test
    public void  openYahoo()
    {
        driver.get("https://in.yahoo.com/?p=us");
    }
@AfterSuite
public void closeBrowser()
{
    driver.quit();
    endTime=System.currentTimeMillis();
    long Total=endTime-startTime;
    System.out.println("Total time taken"+Total);
}



}
