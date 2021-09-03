package TestNG;

import org.testng.annotations.Test;

public class dependanciesMgmt {

    @Test(enabled = true)//if we give false means exception throw
    public void highSchool()
    {
        System.out.println("HighSchool");

    }
    @Test(dependsOnMethods = "highSchool")
    public void higherSec()
    {
        System.out.println("Highersec");
    }
    @Test(dependsOnMethods = "higherSec")
    public void engineering()
    {
        System.out.println("Engineering");
    }
}
