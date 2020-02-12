package Test123.Test123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actionsDemo1 {
  @Test(enabled=false)
  public void keyboardactions() throws InterruptedException {
	  WebDriver driver;
	  driver=Drivershdc2.getDriver("CRM");
	  driver.get("https://www.google.com");
	  WebElement sb=driver.findElement(By.name("q"));
	//  sb.sendKeys("accenture");
	  Actions act=new Actions(driver);
//	  act.keyDown(sb,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
	  act.keyDown(sb,Keys.ALT).sendKeys("accenture").keyUp(Keys.ALT).build().perform();
	  
	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }
  @Test(enabled=false)
  public void movetoelement() throws InterruptedException {
	WebDriver driver;
	  driver= Drivershdc2.getDriver("CRM");
	  driver.get("https://www.spicejet.com/default.aspx");
	  Thread.sleep(2000);
	  WebElement El2= driver.findElement(By.xpath("//a[@id='highlight-addons']"));
	  Actions act2 = new Actions(driver);
	  act2.moveToElement(El2).build().perform();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
	
}


@Test(enabled=false)
public void rightclick() throws InterruptedException {
WebDriver driver;
driver= Drivershdc2.getDriver("CRM");
driver.get("https://www.google.com");
Thread.sleep(2000);
WebElement El3= driver.findElement(By.xpath("//a[text()='Gmail']"));
Actions act3 = new Actions(driver);
act3.contextClick(El3).build().perform();
} 
@Test(enabled=false)
public void doubleclick() throws InterruptedException {
WebDriver driver;
driver= Drivershdc2.getDriver("CRM");
driver.get("http://demowebshop.tricentis.com/");
Thread.sleep(2000);
WebElement El4= driver.findElement(By.xpath("//span[text()='Sign up for our newsletter:']"));
Actions act4 = new Actions(driver);
act4.doubleClick(El4).build().perform();
String txtval = El4.getText();
System.out.println(txtval);
} 
@Test
public void dnd() throws InterruptedException
{
	WebDriver driver;
	driver=Drivershdc2.getDriver("CRM");
	driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement src=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
	WebElement dst=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
	Actions act5=new Actions(driver);
	act5.dragAndDrop(src,dst).build().perform();
	WebElement s1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tfoot/tr/td[1]" ));
	Thread.sleep(3000);
	String A_val=s1.getText();
	System.out.println(A_val);
	String E_val="$0";
	Assert.assertNotSame(A_val, E_val);
	System.out.println("Drag and drop is success");
	
	
	
}
}
