package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.*;
import ec.edu.espol.workshops.second.CarInsurance;


public class StepsDefs{
	private String sex;
	private boolean married;
	private boolean license;
	private int price; 
	private int age;
	
	@Given("customer has no valid license")
		public void customer_has_no_valid_license() {
			this.license = false;
		}
	
	@When("I calculate the premium fee")
		public void i_calculate_the_premium_fee() {
			price = CarInsurance.premiumCarInsurance(30, "M", true, license);
		}
	
	@Then("I should get -1")
		public void i_should_get_1() {
			assertEquals(-1, price);
		}
	
	@Given("customer is female")
		public void customer_is_female() {
			this.sex = "female";
	}
	
	@And("is married")
		public void is_married() {
			married = true;
	}
	
	@And("is 30 years old")
		public void is_30_years_old() {
			age = 30;
		}
	
	@When("I calculate the female and married premium fee")
		public void i_calculate_the_female_and_married_premium_fee() {
			price = CarInsurance.premiumCarInsurance(age, sex, married, true);
			
		}
	
	@Then("I should get 300")
		public void i_should_get_300() {
			assertEquals(300, price);
		}
	
	@Given("customer is male")
		public void customer_is_male() {
			sex = "male";
	}
	
	@And("is not married")
		public void is_not_married() {
			married = false;
	}
	
	@And("is 35 years old")
		public void is_35_years_old() {
			age = 35;
		}
	
	@When("I calculate the male and not married premium fee")
		public void i_calculate_the_male_and_not_married_premium_fee() {
			price = CarInsurance.premiumCarInsurance(age, sex, married, true);
			
		}
	
	@Then("I should get 500")
		public void i_should_get_500() {
			assertEquals(500, price);
		}	
	}