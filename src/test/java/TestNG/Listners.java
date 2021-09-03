package TestNG;

import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("Testcase going to execute");
    }
    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Testcase passed");
    }
    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("Testcase failed");
    }

    @Override
    public void onTestSkipped(ITestResult result)

    {
        System.out.println("skip");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)

    {
        System.out.println("failed/success");
    }
    /*@Override
    public void onstart(ITestResult result)
    {
        System.out.println("Before Everything");
    }

    @Override
    public void onFinish(ITestResult result)

    {
        System.out.println("After Everything");
    }*/
}
