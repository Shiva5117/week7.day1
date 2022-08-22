package stepDefenition;

import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EditLead extends ProjectSpecificMethods{
	
	@And("Click Find leads Link")
	public void findLead() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}
	@Then("Give the firstname as (.*)$")
	public void enterFirstname(String firstname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
	}
	@And("Click on Find leads button")
	public void clickFindleadButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Click on first resulting lead")
	public void clickFistResult() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
	}
	@And("Click on Edit")
	public void clickEdit() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	@Then("Change the company name (.*)$")
	public void changeCompNAme(String Companyname) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(Companyname);
	}
	@And("Click on Update")
	public void clickUpdate() {
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}
	@Then("Confirm the changed Company name appears")
	public void confirmCompname() {
		String compName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(compName);
		if (compName.contains("Wipro")) {
			System.out.println("CompanyName is changed");
		}else {
			System.out.println("CompanyName is not changed");
		}
	}

}
