package Test123.Test123;

import org.testng.annotations.Test;

public class Testngdemo1 {
  @Test(priority=2)
  public  void login()
  {
	  System.out.println("code for login");
  }
  @Test(priority=1, enabled=false)
  public void registration()
  {
	  System.out.println("code for registration");
  }
  @Test(priority = 3)
  public void logout()
  {
	  System.out.println("code for logout");
  }
  
}
