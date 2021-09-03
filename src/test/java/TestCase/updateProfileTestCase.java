package TestCase;

import PageObjectModel.loginPageObject;
import PageObjectModel.updateProfileObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class updateProfileTestCase {
    @Test
    public void updateProfile() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.phptravels.net/login");

        Thread.sleep(3000);

        loginPageObject.UserName(driver).sendKeys("user@phptravels.com");
        loginPageObject.password(driver).sendKeys("demouser");
        loginPageObject.loginButton(driver).click();

        //ToAccess process in next page
        updateProfileObject.myprofile(driver).click();
        updateProfileObject.city(driver).sendKeys("chennai");
        updateProfileObject.phone(driver).sendKeys("7890");
        Thread.sleep(3000);
        updateProfileObject.submit(driver).click();







    }
}
