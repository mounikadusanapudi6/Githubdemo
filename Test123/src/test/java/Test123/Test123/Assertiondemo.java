package Test123.Test123;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiondemo {
  @Test
  public void hardAsrt() {
	  int a=10;
	  int b=25;
	  int c=10;
	  Assert.assertEquals(a, c);
	  System.out.println("comparison done for first time");
	  Assert.assertEquals(a, b);
	  System.out.println(b);
	  System.out.println("comparison");
	  
  }
}
