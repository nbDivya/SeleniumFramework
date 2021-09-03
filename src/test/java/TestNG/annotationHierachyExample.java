package TestNG;

import org.testng.annotations.*;

public class annotationHierachyExample {
    @Test
    public void test()
    {
        System.out.println(" Test");
    }

    @Test
    public void Test2()
    {
        System.out.println("test2");
    }


    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am before method");
    }

    @AfterMethod
    public void AfterMehod()
    {
        System.out.println("I am after method");
    }

    @BeforeClass
    public void Beforeclass()
    {
        System.out.println("I am Before class");
    }

    @AfterClass
    public void Afterclass()
    {
        System.out.println("I am after class");
    }

    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("I am before Test");
    }

    @AfterTest
    public void AfterTest()
    {
        System.out.println("I am After test");
    }
    @BeforeSuite
    public void Beforesuite()
    {
        System.out.println("Before suite");
    }

    @AfterSuite
    public void Aftersuite()
    {
        System.out.println("Aftersuite");
    }

}
