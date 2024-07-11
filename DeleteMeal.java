package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import fall2022droject.Admin;
import fall2022droject.Meal;



public class DeleteMeal 
{
	Admin admin;
	Meal meal;
	
	public DeleteMeal(Meal meal) {
		this.meal = meal;
		this.admin = new Admin("hadeel", "111");
	}
@Given("the admin is logged in")
public void the_admin_is_logged_in() {
	admin.login("hadeel","111");
	}
@Given("there is a meal  name {string} , type {string} , and the price {string}, amount{string}")
public void there_is_a_meal_name_type_and_the_price(String string, String string2, String string3, String string4)
{
	meal.set("PanCake", "breakfast", "17","1");
}

@When("the meal is deleted from the menu")
public void the_meal_is_deleted_from_the_menu() {
	meal.delete(admin);
}

@Then("the meal with name {string} ,type {string} , and the price {string}, amount{string} off the menu")
public void the_meal_with_name_type_and_the_price_off_the_menu(String string, String string2, String string3, String string4) {
	assertEquals( true,meal.isDeleted() );}

@Given("the admin is not logged in")
public void the_admin_is_not_logged_in() {
	admin.logout();
}

@Then("the error messag {string} is given")
public void the_error_messag_is_given(String string) 
{
	admin.logout();
	assertEquals(false,meal.delete(admin));
	System.out.println("cant delete because admin is not log in");
}







}











