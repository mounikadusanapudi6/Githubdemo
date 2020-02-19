package hdc2demos;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver Mouni;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mouni = new ChromeDriver();
		Mouni.get("http://www.google.com");
		
		Mouni.manage().window().maximize();
		Dimension d=new Dimension(300,600);
		
		Mouni.manage().window().setSize(d);
		Thread.sleep(3000);
		
		Point p=new Point(300,600);
		Mouni.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		String E_title="Google";
		String A_title=Mouni.getTitle();
		if(A_title.equals(E_title))
		{
			System.out.println("page opened");
		}
		else
		{
			System.out.println("page not opened");
		}
		Mouni.close();
		Mouni.quit();
		System.out.println("text");
		System.out.println("review level1 by lead");

	}

}
