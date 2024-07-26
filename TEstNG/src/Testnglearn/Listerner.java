package Testnglearn;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerner implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		// Code to execute before a test starts

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// Code to execute on test success
       System.out.println("Testpass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// Code to execute on test failure
		 System.out.println("Testfail : " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// Code to execute on test skip

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Code to execute if a test fails but is within the success percentage

	}

	@Override
	public void onStart(ITestContext context) {
		// Code to execute before any test method is invoked

	}

	@Override
	public void onFinish(ITestContext context) {
		// Code to execute after all test methods have been invoked

	}

}
