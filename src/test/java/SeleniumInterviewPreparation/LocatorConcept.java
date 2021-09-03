package SeleniumInterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorConcept {
    /**
     * Locating element in selenium webdriver is performed with the help of findElement() and findElements()
     * findElement() returns a WebElement Object
     * findElements() returns a List of WebElements
     * If No Element Found returns EmptyList.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com/?.intl=us");
        Thread.sleep(2000);

        /** preference : (1) ID ,Name (Unique)
         * (2) xpath , cssSelector
         * (3) TagName
         * (4) LinkText ,ClassName
         * (5) Partial LinkText
         */

        //   In cssSelector ===> . --->for class  &   # ---> for  id
        //ClassName to be duplicate

        /** 1... ID
         * ********
         */
        //UserName
//        WebElement UserName=driver.findElement(By.id("login-username"));
//        UserName.sendKeys("divibskrn@yahoo.com");
//        //NextBtn
//        WebElement nxtBtn=driver.findElement(By.id("login-signin"));
//        nxtBtn.click();


        /** 2.....NAME
         * *************
         */
//        driver.findElement(By.name("username")).sendKeys("divibskrn@yahoo.com");
//        driver.findElement(By.name("signin")).click();


        /**3...Xpath
         * *********
         */
//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("divibskrn@yahoo.com");
//driver.findElement(By.xpath("//input[@id='login-signin']")).click();


/**4.LinkText
 * **********
 */
//Thread.sleep(2000);
//driver.findElement(By.linkText("Forgot username?")).click();

/**5.CssSelector
 * ************
 */
//driver.findElement(By.cssSelector("#login-username")).sendKeys("divibskrn@yahoo.com");
//driver.findElement(By.cssSelector("#login-signin")).click();

/**6...PartialLinkText
 * *******************
 */
//driver.findElement(By.partialLinkText("Forgot")).click();

/**7...ClassName
 * *************
 */
//driver.findElement(By.className("phone-no")).sendKeys("divibskrn@yahoo.com");

/**8...TagName
 * *************
 */

        List<WebElement> linklist = driver.findElements(By.tagName("a"));
        System.out.println("size"+linklist.size());
        for(int i=0;i<linklist.size();i++)

        {
            String linkText=linklist.get(i).getText();
            System.out.println(linkText);
        }

    }
}
