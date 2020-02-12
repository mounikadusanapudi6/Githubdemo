package Test123.Test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoaut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\WebDriver Mouni;
		WebDriver Mouni;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mouni=new ChromeDriver();
		Mouni.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		Mouni.manage().window().maximize();
		//WebElement Src=Mouni.findElement(By.xpath("(//span[text()='destination'])[1]"));
		//Select Sel1=new Select(Src);
		//Sel1.selectByVisibleText("Asia");
		WebElement m=Mouni.findElement(By.linkText("SignUp"));
		m.click();
		WebElement s=Mouni.findElement(By.xpath("//select[@id='securityQuestion']"));
		Select se1=new Select(s);
				se1.selectByIndex(2);
		
		
		
		
		
		

	}

}
