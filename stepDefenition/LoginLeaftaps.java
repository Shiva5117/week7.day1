package stepDefenition;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLeaftaps extends ProjectSpecificMethods{
	
	
	@Given("Type the Username as {string}")
	public void username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Type the Password as {string}")
	public void password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Click on the Login Button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify that homepage is displayed")
	public void verifyHomepage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if (text.contains("Welcome")) {
			System.out.println("Home Page is verified");
		}else {
			System.err.println("Home page is not displayed");
		}
	}
	
	@But("Verify that Error message is displayed")
	public void errorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}

}
