package Stepdefination1;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition1 {
	WebDriver driver = new ChromeDriver();
    @Given("I have a sample step")
    public void givenSampleStep() {
      //  System.out.println("One");
    	
		driver.get("https://in.indeed.com/?r=us");
     
    }

    @When("I perform some action")
    public void whenPerformAction() {
        // Implement the step definition
    	// System.out.println("two");
    	 //throw new io.cucumber.java.PendingException();
    	driver.findElement(By.id("text-input-what")).click();
	    driver.findElement(By.id("text-input-what")).clear();
    }

    @Then("I should see the expected result")
    public void thenSeeExpectedResult() {
        // Implement the step definition
    	// System.out.println("three");
    //	 throw new io.cucumber.java.PendingException();
    	driver.findElement(By.id("text-input-what")).sendKeys("software testing");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.quit();
    }
}