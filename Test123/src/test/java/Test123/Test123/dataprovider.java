package Test123.Test123;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class dataprovider {
	@Test(dataProvider = "credentials")
	  public void login(String name, String password) {
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		  System.out.println("the username this time is:"+name);
		  System.out.println("the passwd this time is:"+password);
		 WebElement fs=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a" ));
		  fs.click();
		  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(name);
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		  WebElement i=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]" ));
		  i.click();
		  String E_title="Home";
		  String A_title=driver.getTitle();
		  Assert.assertEquals(A_title, E_title);
		  
	  }

	 @DataProvider
	  public Object[][] credentials() {
	    return new Object[][] {
	     new Object[] { "ishu", "Password123" },
	    new Object[] { "Mounika", "Password666" },
	    new Object[] { "Lalitha", "Password123" },
	    };
	  }
	}