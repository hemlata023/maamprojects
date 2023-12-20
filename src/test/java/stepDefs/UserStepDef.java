package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	WebDriver driver;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
	}
//	@When("User enters credentrials")
//	public void user_enters_credentrials() {
//		 driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
//		  driver.findElement(
//					By.xpath("//input[@type='password' or @id='password']")).sendKeys("SuperSecretPassword!");
//		  driver.findElement(By.cssSelector(".radius")).click();
//	}
	
	//Using Scenario outline
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		 driver.findElement(By.cssSelector("input#username")).sendKeys(strUser);
		  driver.findElement(
					By.xpath("//input[@type='password' or @id='password']")).sendKeys(strPwd);
		  driver.findElement(By.cssSelector(".radius")).click();
	}
	
	//Using DataTable as lists
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable userData) {
//		List<List<String>> data = userData.asLists();
//	   String strUser = data.get(0).get(0);
//	   String strPwd = data.get(0).get(1);
//	   driver.findElement(By.cssSelector("input#username")).sendKeys(strUser);
//		  driver.findElement(
//					By.xpath("//input[@type='password' or @id='password']")).sendKeys(strPwd);
//		  driver.findElement(By.cssSelector(".radius")).click();
//	}
//	
	//Using datatable as Maps
	@When("User enters credentials")
	public void user_enters_credentials(DataTable userData) {
		List<Map<String, String>> data = userData.asMaps();
	   String strUser = data.get(0).get("username");
	   String strPwd = data.get(0).get("password");
	   driver.findElement(By.cssSelector("input#username")).sendKeys(strUser);
		  driver.findElement(
					By.xpath("//input[@type='password' or @id='password']")).sendKeys(strPwd);
		  driver.findElement(By.cssSelector(".radius")).click();
	}
	
	
	@Then("Should display success message")
	public void should_display_success_message() {
		 boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		  Assert.assertTrue(isValid);
	}
	
	
}
