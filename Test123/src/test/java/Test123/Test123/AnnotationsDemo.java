package Test123.Test123;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
  @Test
  public void login() {
	  System.out.println("some 5 lines of code for login");
  }
  @BeforeMethod
  public void launch() {
	  System.out.println("some 3 lines of code for launching the application");
  }
  @Test
  public void register() {
	  System.out.println("some 20 lines of code for registration");
  }
  @AfterMethod
  public void closing() {
	  System.out.println("some 16 lines of code for closing");
  }
  @BeforeClass
  public void clearBrowserCache() {
	  System.out.println("some 23 lines of code for clearBrowserCache");
  }
  @AfterClass
  public void deleteCookies() {
	  System.out.println("some 16 lines of code for deleteCookies");
  }
  @BeforeTest
  public void browserConfiguration() {
	  System.out.println("some 18 lines of code for browserConfiguration");
  }
  @AfterTest
  public void browserRollback() {
	  System.out.println("some 18 lines of code for browserRollback");
  }
  @BeforeSuite
  public void connectDatabase() {
	  System.out.println("some 18 lines of code for connectDatabase");
  }
  @AfterSuite
  public void DisconnectDatabase() {
	  System.out.println("some 18 lines of code for DisconnectDatabase");
  }
}
