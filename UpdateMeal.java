package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import fall2022droject.Admin;
import fall2022droject.Meal;

public class UpdateMeal{
	

	Admin admin;
	Meal meal;
	
	public UpdateMeal(Meal meal){
		this.meal = meal;
		this.admin = new Admin("amo", "am444");
	}
	
	@Given("admin logged in")
	public void admin_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		admin.login("amo","am444");
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("a meal  name {string} , type {string} , and the price {string}, amount\"{int}\"")
	public void a_meal_name_type_and_the_price_amount(String string, String string2, String string3, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		meal.set("Pizza", "breakfast", "25","7");
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("the meal is Update missing from the menu")
	public void the_meal_is_update_missing_from_the_menu() {
	    // Write code here that turns the phrase above into concrete actions
		meal.updateMissing(admin);
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("the meal with name {string} ,type {string} , and the price {string}, amount\"{int}\" updated")
	public void the_meal_with_name_type_and_the_price_amount_updated(String string, String string2, String string3, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		
		assertEquals( true,meal.isUpdated() );
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("admin is not logged in")
	public void admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		admin.logout();
	   // throw new io.cucumber.java.PendingException();
	}
	

	@Then("the error messag missing {string} is appear")
	public void the_error_messag_missing_is_appear(String string) {
	    // Write code here that turns the phrase above into concrete actions
		admin.logout();
		assertEquals(false,meal.updateMissing(admin));
		System.out.println("cant Update Missing because admin is not log in");
	  //  throw new io.cucumber.java.PendingException();
	}
	
	@When("the meal is Updating up from the menu")
	public void the_meal_is_updating_up_from_the_menu() {
	    // Write code here that turns the phrase above into concrete actions
		meal.updatingUp(admin);
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("the error messag up {string} is appear")
	public void the_error_messag_up_is_appear(String string) {
	    // Write code here that turns the phrase above into concrete actions
		admin.logout();
		assertEquals(false,meal.updateMissing(admin));
		System.out.println("cant Updating Up because admin is not log in");
	  //  throw new io.cucumber.java.PendingException();
	}
	
}