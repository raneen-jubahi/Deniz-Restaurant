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
public class report 
{
Admin admin;
Client user;
List<Map<String, String>> cuList ;
List<Map<String, String>> meList ;
public report()
{
this.user=user;
admin = new Admin("Haneen", "123");

}

@Given("Admin is login")
public void admin_is_login()
{
	admin.login("Haneen","123"); 
}

@When("admin enters customer columns")
public void admin_enters_customer_columns(io.cucumber.datatable.DataTable dataTable) 
{
	
	
	
	
	System.out.println("THIS CUSTOMER LIST");
   List<Map<String, String>> customerlist =dataTable.asMaps(String.class, String.class);
   cuList=customerlist;
   for(Map<String, String> p:cuList) 
   {
	 System.out.println("__________________________________________________________________________________________________");
     
	 System.out.println(p.get("name"));  
	 System.out.println(p.get("user_name"));  
	 System.out.println(p.get("phone_number"));  
	 System.out.println(p.get("city"));
	 System.out.println("__________________________________________________________________________________________________");
	   
   }
}

@Then("print data of customer")
public void print_data_of_customer()
{

}  
   
@When("admin enters Meal columns")
public void admin_enters_meal_columns(io.cucumber.datatable.DataTable dataTable) 

{System.out.println("THIS MEAL LIST");
	List<Map<String, String>> customerlist =dataTable.asMaps(String.class, String.class);
	   meList=customerlist;
	   for(Map<String, String> p:meList) 
	   {
		 
		 System.out.println("__________________________________________________________________________________________________");
		 System.out.println(p.get("name"));  
		 System.out.println(p.get("type"));  
		 System.out.println(p.get("price"));  
		 System.out.println(p.get("amount"));
		 System.out.println("__________________________________________________________________________________________________");
	   }
}

@Then("print data of Meal")
public void print_data_of_meal() 
{
  
}  
   
  
  
   
}