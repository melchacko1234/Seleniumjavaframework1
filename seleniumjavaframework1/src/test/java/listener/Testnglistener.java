package listener;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testnglistener implements ITestListener{

	@Override
	public void onFinish(ITestContext Context) {
		System.out.println("******** Test completed : "+Context.getName());
		
	}

	@Override
	public void onStart(ITestContext Context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("******** Test Failed : "+result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("******** Test Skiped : "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("******** Test started : "+result.getName());			
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
