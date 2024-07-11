package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import fall2022droject.Admin;
import fall2022droject.Client;

import  java.util.Arrays;
import java.util.ArrayList;

public class SuccessStories 
{

	Admin admin;
	Client user;
	List<Map<String, String>> suList ;
	
	public SuccessStories()
	{
	this.user=user;
	admin = new Admin("Haneen", "123");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Given("the Admin is login")
	public void the_admin_is_login() 
	{
	 admin.login("Haneen","123");
	}

	@When("admin enters Success Stories")
	public void admin_enters_success_stories(io.cucumber.datatable.DataTable dataTable) 
	{
		System.out.println("SuccessStories");
		   List<Map<String, String>> customerlist =dataTable.asMaps(String.class, String.class);
		   suList=customerlist;
		   for(Map<String, String> p:suList) 
		   {
			 System.out.println("__________________________________________________________________________________________________");
			 System.out.println(p.get("name"));  
			 System.out.println(p.get("Success Stories"));  
			 System.out.println("__________________________________________________________________________________________________");
			   
		   }
	}

	@Then("print Success Stories")
	public void print_success_stories() 
	{
	   
	}
	
	
	
	
	
	
	
	
}
