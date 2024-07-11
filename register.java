package fall2022droject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import fall2022droject.Admin;
import fall2022droject.Client;

public class register{

	Client user;
	Admin admin;
	
	public register(Client client)
	{
		this.user = client;
		this.admin = new Admin("amnaOth","am123");
		admin.login("amnaOth","am123");
	}

	
	@Given("that admin login")
	public void that_admin_login() {
	    // Write code here that turns the phrase above into concrete actions
		admin.login("amnaOth","am123");
	}

	@Given("there is a user with name {string}, username {string}, password {string}, phone {string}, and city {string}")
	public void thereis_a_user_with_name_username_password_phone_and_city(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
		user.set("Razan samaneh", "razansam", "razansam", "0569071035", "Nablus");
	}

	@When("the Admin registers the user")
	public void the_admin_registers_the_user() {
	    // Write code here that turns the phrase above into concrete actions
		user.clients = new ArrayList<Client>();
		user.register( admin );
		System.out.println( " result : " + user.isAdded() );
	}

	@Then("the user with name {string}, username {string}, password {string}, phone {string}, and city {string} added")
	public void the_user_with_name_username_password_phone_and_city_added(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(  true ,user.isAdded() );
	}

	@Given("that the admin not login")
	public void that_the_admin_not_login() {
	    // Write code here that turns the phrase above into concrete actions
	    admin.logout();
	    
	}

	@Given("there is a user with  name {string}, username {string}, password {string}, phone {string}, and city {string}")
	public void there_is_a_user_with_name_username_password_phone_and_city(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
		user.set("Razan samaneh", "razansam", "razansam", "0569071035", "Nablus");
	}

	@Given("the user is already registered")
	public void the_user_is_already_registered() {
	    // Write code here that turns the phrase above into concrete actions
		user.set("Razan samaneh", "razansam", "razansam", "0569071035", "Nablus");
		user.register(admin);

		
		user.set("dana aqel", "danaaqe1", "dana123", "05690712222", "salfeet");
		user.register(admin);
		
		assertEquals( false,user.isAdded()  );
	}
	
	
}
