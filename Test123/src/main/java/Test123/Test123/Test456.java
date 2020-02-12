package Test123.Test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test456 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver Mouni;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mouni=new ChromeDriver();
		Mouni.get("http://www.facebook.com");
		WebElement un=Mouni.findElement(By.name("email"));
		//un.click();
		WebElement ps=Mouni.findElement(By.id("pass"));
		un.sendKeys("Lalitha");
		Thread.sleep(3000);
		ps.sendKeys("Password123");
		Thread.sleep(3000);
		//WebElement ps=Mouni.findElement(By.name("userName" ));
		//WebElement md=Mouni.findElement(By.id("password"));
		//ps.sendKeys("Lalitha");
		
		//md.sendKeys("Password123");
		//WebElement ef=Mouni.findElement(By.name("Login"));
	//	ef.click();
		Mouni.close();
		

	}

}
