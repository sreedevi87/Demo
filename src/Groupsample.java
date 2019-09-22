import org.testng.annotations.*;
import org.testng.Reporter;

public class Groupsample {
	@Test(groups= {"navya"})
	public void testCase1() {
		 
		 System.out.println("This is the Test Case 1");
		 Reporter.log("after execution of first test case");
		 
		 }
	@Test(groups= {"navya"})
	public void testCase2() {
		 
		 System.out.println("This is the Test Case 2");
		 Reporter.log("after execution of second test case");
		 
		 }
	@Test(groups= {"navya"})
	public void testCase3() {
		 
		 System.out.println("This is the Test Case 3");
		 
		 }
	@Test(groups= {"sree"})
	public void testCase4() {
		 
		 System.out.println("This is the Test Case 4");
		 
		 }
	@Test(groups= {"sree"})
	public void testCase5() {
		 
		 System.out.println("This is the Test Case 5");
		 
		 }
}
