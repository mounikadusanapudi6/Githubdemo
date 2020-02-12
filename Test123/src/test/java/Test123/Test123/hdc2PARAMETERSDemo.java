package Test123.Test123;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class hdc2PARAMETERSDemo {
	@Parameters({"tester","location"})
  @Test
  public void primeMembership(String tester,String location) {
	  System.out.println("code for primemembership");
	  System.out.println("Its executed by: "+ tester);
	  System.out.println("Its executed from: "+ location);
  }
  @Test
  public void renewal() {
	  System.out.println("code for renewal");
  }
  
  @Parameters({"tester","location"})
  @Test
  public void termination(String tester,String location)
  {
	  System.out.println("code for termination");
	  System.out.println("Its executed by: "+ tester);
	  System.out.println("Its executed from: "+ location);
  }
}
