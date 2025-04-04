package paraleeltesting;

import org.testng.annotations.Test;

public class samplethree {
	
	
	//invocation count if u want run method repeatedly
	//threadPoolSize -->how many threads u want fir that method
	//timeOut  -->in how many sec u need to run and this can give at method level or suite level as well time-out=100000
	@Test(invocationCount=2, threadPoolSize=2, timeOut=10000 )
	public void sample31()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test31......" +id);
	}
	
	@Test(invocationCount=4)
	public void sample32()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test32......" +id);
	}
		


}
