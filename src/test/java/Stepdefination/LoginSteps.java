package Stepdefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    WebDriver driver = new ChromeDriver();  // Initialize WebDriver

    @Given("User is on the OpenCart homepage")
    public void user_is_on_the_open_cart_homepage() {
        // Code to open the OpenCart homepage
   //     driver.get("https://demo.opencart.com/");
        System.out.println("Navigated to OpenCart homepage");
    }

    @When("User navigates to the MacBook product page")
    public void user_navigates_to_the_mac_book_product_page() {
        // Code to navigate to the MacBook product page
      //  driver.navigate().to("https://demo.opencart.com/en-gb/product/macbook");
        System.out.println("Navigated to MacBook product page");
    }

    @Then("User should be on the MacBook product page")
    public void user_should_be_on_the_mac_book_product_page() {
        // Code to verify that the user is on the MacBook product page
        String expectedUrl = "https://demo.opencart.com/en-gb/product/macbook";
        String actualUrl = driver.getCurrentUrl();
        assertEquals("User is not on the MacBook product page", expectedUrl, actualUrl);
        System.out.println("User is on the MacBook product page");
    }

    // Close the browser after the test
    @After
    public void tearDown() {
        driver.quit();
    }
}
