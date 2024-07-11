package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import fall2022droject.Admin;
import fall2022droject.Meal;



public class AddMeal 
{
	Admin admin;
	Meal meal;
	
	public AddMeal(Meal meal) {
		this.meal = meal;
		admin = new Admin("Haneen", "123");
	}
	
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() 
	{
		admin.login("Haneen","123");
		
	}

	@Given("there is a meal with name {string} , type {string} , and the price {string}, amount {string}")
	public void there_is_a_meal_with_name_type_and_the_price(String string, String string2, String string3, String string4)
	{
		meal.set("burgar", "lunch", "20", "2");
		
		
	}

	@When("the meal is added to the menu")
	public void the_meal_is_added_to_the_menu() 
	{
		meal.add(admin);
	}

	@Then("the meal with name {string} ,type {string} , and the price {string}, amount {string} inside the menu")
	public void the_meal_with_name_type_and_the_price_inside_the_menu(String string, String string2, String string3, String string4) 
	{
		assertEquals( true,meal.isAdded() );
	}

	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in()
	{
		admin.logout();
	}

	
	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) 
	{
		admin.logout();
		assertEquals(false,meal.add(admin));
		System.out.println("cant add because admin is not log in");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
