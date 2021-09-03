package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class updateProfileObjectFindBy {
    @FindBy(xpath="//ul[@class='menu-vertical-01']/li[2]/a")
    public static WebElement myprofile;

    @FindBy(name="city")
    public static WebElement city;

    @FindBy(name="phone")
    public static WebElement phone;

    @FindBy(xpath="//*[@id='profilefrm']/div/div/div[7]/div/button")
    public static WebElement submit;

}
