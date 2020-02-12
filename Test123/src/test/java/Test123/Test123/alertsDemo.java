package Test123.Test123;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class alertsDemo {
  @Test(enabled=false)
  public void f() {
	
	  WebDriver driver;
	  driver=Drivershdc2.getDriver("CRM");
	  driver.get("https://www.tsrtconline.in/oprs-web/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@name=\"searchBtn\"]")).click();
	  if(ExpectedConditions.alertIsPresent() !=null)
	  {
		  System.out.println("alerts are present");
		  Alert alrt=driver.switchTo().alert();
		  System.out.println(alrt.getText());
		  alrt.accept();
	  }
	  else
	  {
		  System.out.println("alerts are not present");
	  }
	  
  }
  @Test
  public void framedemo() {
	
	  WebDriver driver;
	  driver=Drivershdc2.getDriver("CRM");
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.switchTo().frame(driver.findElement(By.className("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  driver.switchTo().defaultContent();//to come out from frame
	  
  
}
}
