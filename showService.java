package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.Month;

import fall2022droject.Admin;
import fall2022droject.Client;
import fall2022droject.Service;


public class showService
{
	Admin admin;
	Client user;
	Service service;
	
	public showService(Client client)
	{
		this.service = new Service();
		this.user = client;
		this.admin = new Admin("test","123");
		admin.login("Haneen","123");
	}
	
	@Given("user is login")
	public void user_is_login() 
	{
		user.set("hadeel darawsha", "hadeel", "1234", "0569025697", "tubas");
		user.register( admin );
	}

	@When("show service")
	public void show_service() 
	{
		
	}

	@Then("printf Service")
	public void printf_service() 
	{
		System.out.println("Name of Service:\t \t \t ");  System.out.println(service.name);
		System.out.println("description of Service:\t \t \t ");  System.out.println(service.description);
		System.out.println("cost of service:\t \t \t ");  System.out.println(service.costofservice);
	}

	@Given("user is logout")
	public void user_is_logout() 
	{
		 admin.logout();
		 
		 assertEquals(false,admin.isLogged());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}