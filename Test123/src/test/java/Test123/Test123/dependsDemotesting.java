package Test123.Test123;

import org.testng.annotations.Test;

public class dependsDemotesting {
  @Test(priority=2,dependsOnMethods="m1")
  public void flipkart() {
	  System.out.println("code for the login of flipcart");
  }
  @Test
  public void m1() {	
	  int a=10;
	  int b=0;
	  int c=a/b;
	  System.out.println("the final values is : "+c );
  }
  @Test(priority=1)
 public void FlipkartReg() {
	  System.out.println("code for the registration flipkart" );
  }
}
