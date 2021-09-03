package TestNG;

import org.testng.annotations.Test;

public class skipATestCase {
    @Test(priority=0)
    public void startACar()
    {
        System.out.println("Start the car");

    }
    @Test(priority=2,enabled = false)//it should be hidden default enabled value bcum true
    public void turnOnTheMusic()
    {
        System.out.println("Music turned on");
    }
    @Test(priority=1)
    public void putFirstGear()
    {
        System.out.println("first Gear");
    }
}
