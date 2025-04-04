package groupstestng;

import org.testng.annotations.Test;

public class sampolethree {
	
	@Test(groups ="featureone")
	public void sammmone()
	{
		System.out.println("3samone");
	}
	
	@Test(groups ="featureTwo")
	public void sammmtwo()
	{
		System.out.println("3samtwo");
	}
	
	@Test(groups ="featureThree")
	public void sammthtree()
	{
		System.out.println("3samthree");
	}
	
	
	/*<suite name="Suite">
	
	
  <test thread-count="5" name="Test">
	  
	  <groups>
		
		<define name="Regrtession">
			<include name ="featureone"/>
			<include name ="featureTwo"/>
		</define>
		
		<define name="smoke">
			<include name ="featureone"/>
			<include name ="featureTwo"/>
			<include name ="featureThree"/>
		</define>
		<run>
			<include name="smoke"/>
		</run>
	</groups>
    <classes>
      <class name="groupstestng.sampletwo"/>
      <class name="groupstestng.sampolethree"/>
      <class name="groupstestng.sampleone"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->*/

}
