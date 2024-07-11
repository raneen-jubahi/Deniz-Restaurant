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



public class showappointment
{
 
	Admin admin;
	Client user;
	Meal meal;
	Table t = new Table(1, 5);
    LocalDateTime dateTime = LocalDateTime.of(2019, Month.DECEMBER, 15, 11, 00);
	public showappointment(Client client)
	{
		this.meal = new Meal();
		this.user = client;
		this.admin = new Admin("test","123");
		admin.login("Haneen","123");
	}
	
	
	@Given("user login")
	public void user_login() {
	    // Write code here that turns the phrase above into concrete actions
		user.set("hadeel darawsha", "hadeel", "1234", "0569025697", "tubas");
		user.register( admin );
	   
	}

	@When("show")
	public void show() {
	    // Write code here that turns the phrase above into concrete actions
		
		
	}

	@Then("printf your reservation")
	public void printf_your_reservation() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("your name:\t \t \t ");  System.out.println(user.name);
		System.out.println("your phone :\t \t \t ");  System.out.println(user.phonenumber);
		System.out.println("your table :\t \t \t ");  System.out.println(t.getId());
		System.out.println("your table # :\t \t \t ");  System.out.println(t.getMax());
		System.out.println("your reservation date :\t \t \t ");  System.out.println(dateTime);
		System.out.println("\t \t \t");  System.out.println("welcome :\t \t \t ");  System.out.println("\t \t \t");
		
		
	}

	@Given("user logout")
	public void user_logout() {
	    // Write code here that turns the phrase above into concrete actions
	   admin.logout();
	}

	@Then("printf {string}")
	public void printf(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\t \t \t");  System.out.println("you must to login :\t \t \t ");  System.out.println("\t \t \t");
	}
	
	
}