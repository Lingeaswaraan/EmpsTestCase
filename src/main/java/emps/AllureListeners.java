package emps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import io.qameta.allure.Attachment;

public class AllureListeners implements ITestListener {

	 @Attachment(value = "screenshots",type="image/png" )
		public byte[] screenshotCapture(WebDriver driver) {
			return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		}
		@Attachment(value="Print cause",type="plain")
	    public static String logs(String message) {
	    	return message;
	    }
		public void onTestFailure(ITestResult result) {
			screenshotCapture(BaseClass.getDriver());
			logs(result.getMethod().getConstructorOrMethod().getName());
			
		}
		@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}
}
