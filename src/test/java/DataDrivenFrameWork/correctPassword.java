package DataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class correctPassword {
    @Test
    public void correctpwd() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();
        driver.quit();

    }
}