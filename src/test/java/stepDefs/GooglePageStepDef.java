package stepDefs;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;


import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef{
	
	WebDriver driver = TestBase.getDriver();
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		
	   TestBase.openUrl("https://www.google.com/");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement srcBox = driver.findElement(By.name("q"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.submit();
	}
	@Then("Should display Java Result Page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
 	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement srcBox = driver.findElement(By.name("q"));
		srcBox.sendKeys("Selenium Tutorial");
		srcBox.submit();
	}
	@Then("Should display Selenium Result Page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search Page");
	}

//	@After
//	public void attachScenario(Scenario scenario) {
//		if(scenario.isFailed()) {
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			byte[] imgBytes = screen.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(imgBytes, "image/png", "ScreenImage");
//		}
//	}
}
