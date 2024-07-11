package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import fall2022droject.Admin;
import fall2022droject.Service;
public class addService
{
	Admin admin;
	Service service;
	
	public addService(Service service) 
	{
		this.service = service;
		admin = new Admin("Haneen", "123");
	}
	//@Given("that the admin is logged in")
	//public void that_the_admin_is_logged_in() 
//{
		//admin.login("Haneen","123");
		
	//}
	
	
	@Given("there is a Service with name {string} , description {string} , and the cost_of_service {string}")
	public void there_is_a_service_with_name_description_and_the_cost_of_service(String string, String string2, String string3) 
	{
		admin.login("Haneen","123");
		service.set("buffet service", "People go to a long table in which there are many types of food and many delicious items, so that the customers add what they want on a plate.", "100");
	}

	@When("the Service is added to the System")
	public void the_service_is_added_to_the_system() 
	{
		service.add(admin);
	}

	@Then("the Service with name {string} , description {string} , and the cost_of_service {string} inside the System")
	public void the_service_with_name_description_and_the_cost_of_service_inside_the_system(String string, String string2, String string3) {
		
		assertEquals( true,service.isAdded() );
		
		
	}

	
}	
	