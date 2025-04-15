package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepdef {
	
	
//	@BeforeAll
//	public static void setupBrowser()
//	{
//		System.out.println("before all the scenarioes");
//	}
//	
//	@AfterAll
//	public static void closeBroewser()
//	{
//		System.out.println("after all the scenarioes");
//	}
//	
//	@Before("@SmokeTest")
//	//@Before("@SmokeTest")  --> tagged hooks
//	public void setupDatasmoke()
//	{
//		System.out.println("Before Each smoke scenarioes");
//	}
//	
//	@After("@SmokeTest")
//	public void closeDBsmoke()
//	{
//		System.out.println("After Each smoke scenarioes");
//	}
//	
//	@Before("@RegreesionTest")
//	public void setupDatareg()
//	{
//		System.out.println("Before Each reg scenarioes");
//	}
//	
//	@After("@RegreesionTest")
//	public void closeDBreg()
//	{
//		System.out.println("After Each reg scenarioes");
//	}
	
	
	//ordering
	
//	@Before(order = 3)
//	public void setupDatareg()
//	{
//		System.out.println("Before Each  scenarioes");
//	}
//	
//	@Before(order = 1)
//	public void readdatafile()
//	{
//		System.out.println("read data file");
//	}
//	
//	@Before(order = 2)
//	public void initibrowser()
//	{
//		System.out.println("init browser....");
//	}
	
	@Before(value="@SmokeTest",order = 2)
	public void readadatafile()
	{
		System.out.println("readdatafilesmoke....");
	}
	
	@Before(value="@SmokeTest",order = 1)
	public void initibrowsersmoke()
	{
		System.out.println("init browser....");
	}
	
	@Before(value="@RegreesionTest", order = 1)
	public void initibrowser()
	{
		System.out.println("init browser....");
	}
	
	@Before(value="@RegreesionTest",order = 2)
	public void readdatafile()
	{
		System.out.println("readdatafilereg ....");
	}
	
	
	@Given("user will login")
	public void user_will_login() {
	    
		
		System.out.println("login page");
	}
	
	@When("user click view Tasks")
	public void user_click_view_tasks() {
		System.out.println("clicks on vie page");
	}
	
	@When("user creats new deal")
	public void user_creats_new_deal() {
		System.out.println("created new deal");
	}
	
	@When("user click view contact")
	public void user_click_view_contact() {
		System.out.println("view contact");
	}
	
	@When("user click view deals")
	public void user_click_view_deals() {
		System.out.println("view deals");
	}
	
	@When("user delete contact")
	public void user_delete_contact() {
		System.out.println("delete contact");
	}
	
	@When("user creats new Tasks")
	public void user_creats_new_tasks() {
		System.out.println("create new task");
	}
	
	
	@When("user creats new contact")
	public void user_creats_new_contact() {
		System.out.println("create new contct");
	}
	
	@When("user delete deals")
	public void user_delete_deals() {
		System.out.println("delete deals");
	}
	
	@When("user delete Tasks")
	public void user_delete_tasks() {
		System.out.println("delete tasks");
	}
	
	
	
	
	
	
	
	
	

}
