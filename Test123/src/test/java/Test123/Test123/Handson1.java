package Test123.Test123;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handson1 {
  @Test(enabled=false)
  public void f() {
	  WebDriver driver;
	  driver=Drivershdc2.getDriver("CRM");
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).click();
	  Actions act=new Actions(driver);
 
	  act.keyDown(Keys.ALT).sendKeys("computer").keyUp(Keys.ALT).build().perform();
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	  
	   
  }
  @Test(enabled=false)
 public void TestMe() //throws InterruptedException
  {
	   WebDriver driver;
	      driver=Drivershdc2.getDriver("CRM"); //Launch
	      driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm"); //url
	      driver.manage().window().maximize();
	      WebElement a=driver.findElement(By.xpath("//span[text()='AboutUs']"));
	      Actions act1=new Actions(driver);
	      act1.moveToElement(a).build().perform();
	      WebElement b=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	      Actions act2=new Actions(driver);
	      act1.moveToElement(b).build().perform();
	      driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
	      List<WebElement> c=driver.findElements(By.tagName("p"));
	      int n=c.size();
	      Set<String> t_windows=driver.getWindowHandles();
	      for(String s: t_windows)
	         {
	    	  driver.switchTo().window(s);
	             String con=driver.getWindowHandle();
	          }      
	      driver.switchTo().frame(driver.findElement(By.name("main_page")));
	      WebElement d=driver.findElement(By.xpath("//*[@id=\"demo3\"]"));
	      System.out.println(d.getText());
     
  }
  @Test 
  public void Naukri() throws InterruptedException
  {
      WebDriver driver ;
      driver=Drivershdc2.getDriver("CRM");
      driver.get("https://www.naukri.com/");
      Thread.sleep(3000);
     String text= driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div/h3")).getText();
     System.out.println(text);
  }
  
}

