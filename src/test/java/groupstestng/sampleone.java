package groupstestng;

import org.testng.annotations.Test;

public class sampleone {
	
	@Test(groups ="featureone")
	public void sampleOne()
	{
		System.out.println("sampleonetest");
	}
	
	@Test(groups ="featureTwo")
	public void sampletwo()
	{
		System.out.println("sampletwotes");
	}
	
	@Test(groups ="featureThree")
	public void samplethree()
	{
		System.out.println("samplethreetest");
	}
	
	
/*<suite name="Suite">
	
	<groups>
		<run>
			<include name="featureone"/>
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
	
	//only featureone grp willbe executed

}
