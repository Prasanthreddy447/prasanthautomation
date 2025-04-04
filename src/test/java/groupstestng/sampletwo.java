package groupstestng;

import org.testng.annotations.Test;

public class sampletwo {
	
	@Test(groups ="featureone")
	public void samone()
	{
		System.out.println("2sampleonetest");
	}
	
	@Test(groups ="featureTwo")
	public void samtwo()
	{
		System.out.println("2samtwo");
	}
	
	@Test(groups ="featureThree")
	public void samthree()
	{
		System.out.println("2samthree");
	}
	
/*<suite name="Suite">
	
	<groups>
		<run>
			<exclude name="featureone"/>
		</run>
	</groups>
  <test thread-count="5" name="Test">
    <classes>
      <class name="groupstestng.sampletwo"/>
      <class name="groupstestng.sampolethree"/>
      <class name="groupstestng.sampleone"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->*/
	
	//except feature one group all will be executed

}
