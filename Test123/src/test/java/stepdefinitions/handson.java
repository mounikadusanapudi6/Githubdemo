package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class handson {
WebDriver Mouni;
@Given("Application is launched by the guest user")
public void application_is_launched_by_the_guest_user() {

	
	Mouni = new ChromeDriver();
	Mouni.get("http://demowebshop.tricentis.com/");
	
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	
	
}

@When("user enters data for every mandatory field")
public void user_enters_data_for_every_mandatory_field() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	Mouni.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();

	Mouni.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();

	Mouni.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]")).click();

	Mouni.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("mouni");

	Mouni.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("sai");

	Mouni.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("mounisai@gmail.com");

	Mouni.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("mouni666");

	Mouni.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("mouni666"
			+ "");


}

@When("submits the application")
public void submits_the_application() {
	Mouni.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	   
    // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
}

@Then("verifies registration status")
public void verifies_registration_status() {
	String x=Mouni.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();

    String y="Your registration completed";

Assert.assertEquals(x, y);
   
System.out.println("registration is successful");

	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	//System.out.println("code for verification");
}

@When("user enters valid username {string}")
public void user_enters_valid_username(String string) {
	Mouni.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	  
    WebElement x=Mouni.findElement(By.xpath("//*[@id=\"Email\"]]"));

     x.sendKeys("un");

	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("user enters valid password {string}")
public void user_enters_valid_password(String string) {

    WebElement y=Mouni.findElement(By.xpath("//*[@id=\"Password\"]"));

    y.sendKeys("ps");
    
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("user submits the application")
public void user_submits_the_application() {
    Mouni.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
    
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("verifies the login status")
public void verifies_the_login_status() {
	System.out.println("success");
	  
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

}
