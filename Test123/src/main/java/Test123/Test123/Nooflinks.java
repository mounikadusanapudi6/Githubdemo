package Test123.Test123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nooflinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Mouni;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mouni=new ChromeDriver();
		Mouni.get("http://demowebshop.tricentis.com/");
		Mouni.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//this is applicable to every subsequent line of code in this prgm
		//and this is going to work like exist of UFT that means whenever it is req.d then
		//consume the complete given time but by any chance if the webelement present in
		//a lesser time it will  continue moving further without making much delay
		WebDriverWait wait1=new WebDriverWait(Mouni,60);//60 seconds
		wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
		Mouni.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> t_links=Mouni.findElements(By.tagName("a"));
		
		int n_links=t_links.size();
		System.out.println(n_links);
		for(int i=0;i<n_links;i++)
		{
			String l_linkname=t_links.get(i).getText();
			System.out.println("The" +i +"th" +"link is: "+l_linkname);
		
		}
			
			
			
	}

}
