package listener;

import org.testng.*;

public class TestNGListener implements ITestListener , ISuiteListener {


    public void onTestStart(ITestResult iTestResult) {

        System.out.println("****** Start :" +iTestResult.getName() );
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("****** Success :" +iTestResult.getName() );

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("****** Failure :" +iTestResult.getName() );

    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("****** Skipped :" +iTestResult.getName() );

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("****** Percentage :" +iTestResult.getName() );

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("****** onStart :" +iTestContext.getName() );

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("****** onFinish :" +iTestContext.getName() );

    }

    public void onStart(ISuite iSuite) {

    }

    public void onFinish(ISuite iSuite) {

    }
}
