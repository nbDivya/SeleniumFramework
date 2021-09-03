package TestCase;

import PageObjectModel.loginpagewithfindby;
import PageObjectModel.updateProfileObjectFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class updateProfileTestCasefindBy {
    @Test
    public void update() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.phptravels.net/login");

        Thread.sleep(3000);


        PageFactory.initElements(driver, loginpagewithfindby.class);

        loginpagewithfindby.username.sendKeys("user@phptravels.com");
        loginpagewithfindby.password.sendKeys("demouser");
        loginpagewithfindby.submit.click();

        Thread.sleep(3000);

        PageFactory.initElements(driver, updateProfileObjectFindBy.class);

        updateProfileObjectFindBy.myprofile.click();
        updateProfileObjectFindBy.city.sendKeys("chennai");
        updateProfileObjectFindBy.phone.sendKeys("12345");
        updateProfileObjectFindBy.submit.click();



    }
}
