package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpagewithfindby {
    @FindBy(name="username")
    public static WebElement username;

    @FindBy(name="password")
    public static WebElement password;

    @FindBy(xpath="//*[@id='loginfrm']/button")
    public static WebElement submit;

}
