package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import fall2022droject.Admin;
import fall2022droject.Meal;



public class SearchMeal 
{

	Admin admin;
	Meal meal;
	ArrayList<String> result; // has results of search operations
	
	public SearchMeal()
	{
		admin = new Admin("Haneen", "123");
		meal = new Meal();
		result = new ArrayList<String>(); 
	}	
	
	
	
	
	
	

@Given("these meals in the menu")
public void these_meals_in_the_menu(io.cucumber.datatable.DataTable dataTable)
{
	admin.login("Haneen", "123");
	
	meal.set( "Burgar" , "lunch" , "20", "65" );
	meal.add(admin);
	
	meal.set( "shawrma" , " lunch" , "40" , "65" );
	meal.add(admin);
	
	meal.set( "Chicken Frid" , "lunch" , "10" , "50" );
	meal.add(admin);
	
	meal.set( "Pizza" , "lunch" , "30" , "60" );
	meal.add(admin);
	
	meal.set( "Falafel" , "break fast" , "30" , "100" );
	meal.add(admin);
	
	meal.set( "PanCake" , "break fast" , "30" , "50" );
	meal.add(admin);
	
	meal.set( "Hommos" , "dinner" , "10" , "65" );
	meal.add(admin);
	
	meal.set( "Butter Chicken" , "lunch" , "50" , "65" );
	meal.add(admin);
	
	admin.logout();

}

@Given("the admin loggs out")
public void the_admin_loggs_out() 
{
	admin.logout();
}

@Given("the admin is not  logged in")
public void the_admin_is_not_logged_in()
{
	admin.login("Haneen","123");
}



@When("the user search for the text {string}")
public void the_user_search_for_the_text(String string)
{
	admin.login("Haneen","123");
			
			meal.search("bur");
			meal.search("rice");			
			meal.search("chicken");
			meal.search("rice");

}

@Then("the meal with name {string} is found")
public void the_meal_with_name_is_found(String string)
{
	meal.isFounded=true;
	assertEquals(true,meal.isfound());
	
}

@Then("no meal found")
public void no_meal_found() 
{
	assertEquals( false,meal.isfound() );
}



@Then("the meal with name {string} and {string} are found")
public void the_meal_with_name_and_are_found(String string, String string2) 
{
	assertEquals(false,meal.isfound());
	}	
	
	

	
	
}