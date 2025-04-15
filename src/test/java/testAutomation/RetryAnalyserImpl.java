package testAutomation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImpl implements IRetryAnalyzer{
	
	private int retryCount=0;
	private static final int maxretrycunt=3;

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess())
		{
			if(retryCount<maxretrycunt)
			{
				retryCount++;
				return true;
			}
		}
		return false;
	}
	
	
	

}
