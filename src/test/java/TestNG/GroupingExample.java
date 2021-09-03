package TestNG;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups={"Apple"})
    public void Apple1()    {
        System.out.println("Apple Testing");
    }
    @Test(groups = {"Apple"})
    public void Apple2()
    {
        System.out.println("Apple Testing");
    }
    @Test(groups={"moto"})
    public void moto1()
    {
        System.out.println("Moto Testing");
    }
    @Test(groups={"moto"})
    public void moto2()
    {
        System.out.println("Moto Testing");
    }
    @Test(groups={"vivo"})
    public void vivo1()
    {
        System.out.println("Vivo Testing");
    }
    @Test(groups={"vivo"})
    public  void vivo2()
    {
        System.out.println("Vivo Testing");
    }
    @Test(groups={"Lenovo"})
    public void Lenovo1()
    {
        System.out.println("Lenovo Testing");
    }
    @Test(groups = {"Lenovo"})
    public void Lenovo2()
    {
        System.out.println("Lenovo Testing");
    }
}
