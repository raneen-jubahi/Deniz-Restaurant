package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.Month;

import fall2022droject.*;
//import fall2022Project.Admin;
//import fall2022Project.Client;
//import fall2022Project.Meal;
//import fall2022Project.Table;


public class deleteappointment
{

	Admin admin;
	Client user;
	Meal meal;
	Table t = new Table(1, 5);
    LocalDateTime dateTime = LocalDateTime.of(2019, Month.DECEMBER, 15, 11, 00);
	public deleteappointment(Client client)
	{
		this.meal = new Meal();
		this.user = client;
		this.admin = new Admin("test","123");
		admin.login("Haneen","123");
	}
	
	
	@Given("the user is logged in")
	public void the_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		user.set("hadeel darawsha", "hadeel", "1234", "0569025697", "tubas");
		user.register( admin );
	}

	@When("delete")
	public void delete() {
	    // Write code here that turns the phrase above into concrete actions
		
		
	}

	@Then("the reservation is deleted")
	public void the_reservation_is_deleted() {
		
	    // Write code here that turns the phrase above into concrete actions
		
		 assertTrue(t.isFree(dateTime));
	    
	}

	@Given("the user is not logged in")
	public void the_user_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	admin.logout();
	    
	}

	@Then("message {string} given")
	public void message_given(String string) {
		t.reserve(dateTime, 2, "Alice");
		 assertFalse(t.isFree(dateTime));
		
		System.out.println("cant delete because admin is not log in");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
	
	