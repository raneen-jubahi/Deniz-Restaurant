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
//import fall2022Project.Client;
//import fall2022Project.Meal;
//import fall2022Project.Resturant;
//import fall2022Project.Table;


public class addappointment
{

	Admin admin;
	Client user;
	Meal meal;
	
	
	public addappointment(Client client)
	{
		this.meal = new Meal();
		this.user = client;
		this.admin = new Admin("test","123");
	}
	
	
	
	@Given("that the user is logged in")
	public void that_the_user_is_logged_in()
	{
		user.set("hadeel darawsha", "hadeel", "1234", "0569025697", "tubas");
		user.register( admin );
		
		
	}
	

	@Given("the table not reseved")
	public void the_table_not_reseved() 
	{
		Table t = new Table(1, 5);
        LocalDateTime dateTime = LocalDateTime.of(2019, Month.DECEMBER, 15, 11, 00);

        assertTrue(t.isFree(dateTime));
       //t.reserve(dateTime, 2, "Alice", "555");
       // assertFalse(t.isFree(dateTime));
	}

	

	@When("add appointment")
	public void add_appointment()
	{
		
		    Resturant r = new Resturant();
		    r.addTable(1, 2);
		    r.addTable(2, 4);
		    r.addTable(3, 6);
		    r.addTable(4, 8);

		    assertEquals(3, r.reserveTable("23/11/2019 13", 6, "Dranidis", "699555555"));
		    assertEquals(4, r.reserveTable("23/11/2019 13", 6, "Dranidis", "699555555"));
		    assertEquals(-1, r.reserveTable("23/11/2019 13", 6, "Dranidis", "699555555"));
		    assertEquals(2, r.reserveTable("23/11/2019 13", 4, "Dranidis", "699555555"));
		    assertEquals(1, r.reserveTable("23/11/2019 13", 2, "Dranidis", "699555555"));
		    assertEquals(-1, r.reserveTable("23/11/2019 13", 2, "Dranidis", "699555555"));
		    assertEquals(4, r.reserveTable("24/11/2019 13", 8, "Dranidis", "699555555"));
		    assertEquals(-1, r.reserveTable("25/11/2019 13", 10, "Dranidis", "699555555"));
		  }
	

	@Then("the table reserved by user")
	public void the_table_reserved_by_user() 
	{
		Table t = new Table(1, 5);
        LocalDateTime dateTime = LocalDateTime.of(2019, Month.DECEMBER, 15, 11, 00);

        assertTrue(t.isFree(dateTime));
        t.reserve(dateTime, 2, "Alice");
        //assertFalse(t.isFree(dateTime));
	}


@Given("that the user is not logged in")
public void that_the_user_is_not_logged_in() 
{
	
  
}

@Given("the table  reseved")
public void the_table_reseved() 
{
	Table t = new Table(1, 5);
    LocalDateTime dateTime = LocalDateTime.of(2019, Month.DECEMBER, 15, 11, 00);
      
  //  assertTrue(t.isFree(dateTime));
   t.reserve(dateTime, 2, "Alice");
   assertFalse(t.isFree(dateTime));
}
	
	
	
	
	
	
	
	@Then("the message {string} is given")
	public void the_message_is_given(String string)
	{
		admin.logout();
	
		System.out.println("cant add because admin is not log in");
	}

	

	
	
	
}
