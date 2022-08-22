package stepDefenition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethods{
	
	@When("Click on CRMSFA link")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Click on Leads")
	public void cilckLead(){
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click on Create Lead Link")
	public void clickCreateLead(){
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Then("Enter the Companyname as (.*)$")
	public void enterCompname(String Compname){
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Compname);
	}
	
	@And("Enter the firstname as (.*)$")
	public void enterFirstName(String firstname){
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}
	
	@And("Enter the lastname as (.*)$")
	public void enterLastNAme(String lastname){
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	
	@When("Click on Create Button")
	public void clickCreateButton(){
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Verify the title")
	public void verifyTitle(){
		String tittle = driver.getTitle();
		System.out.println(tittle);
		if (tittle.contains("View Lead")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
		}
	}

}
