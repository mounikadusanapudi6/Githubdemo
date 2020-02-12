package Test123.Test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver Mouni;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mouni=new ChromeDriver();
		Mouni.get("http://www.facebook.com");
		WebElement fs=Mouni.findElement(By.name("firstname" ));
		fs.sendKeys();
		WebElement ls=Mouni.findElement(By.name("lastname" ));
		ls.sendKeys();
		//WebElement n=Mouni.findElement(By.id("u_0_r"));
		
	//	WebElement pw=Mouni.findElement(By.id("u_0_w"));
		//WebElement 
		
		
		

	}

}
