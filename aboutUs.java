package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aboutUs{
	
	
	public aboutUs() {
		
	}
	
	@Given("the user wont to know something")
	public void the_user_wont_to_know_something() {
	  
	}

	@When("press about")
	public void press_about() {
	    
	}

	@Then("Print information about the restaurant")
	public void print_information_about_the_restaurant() {
	   System.out.println();
	   System.out.printf("\t \t \t");
	    System.out.println("Palestinian Restaurant");
	 
		   
	   System.out.println("welcome");
	   System.out.println();
	   System.out.printf("\t \t ");
	   System.out.println("The restaurant is open every day from 9:00 AM to 12:00 AM");
	   System.out.println("\t");
	   System.out.println("We offer you the most delicious meals and food, and also breakfast service is available to you.");
	   System.out.println("thank you , ENJOY");
	   
	}

}