package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contactUs{
	
	
	public contactUs() {
		
	}
	
	@Given("the user wont to contact the restaurant")
	public void the_user_wont_to_contact_the_restaurant() {
	   
	}

	@When("press contact Us")
	public void press_contact_us() {
	 
	}

	@Then("Print All he can use to contact us")
	public void print_all_he_can_use_to_contact_us() {
		  System.out.println();
		   System.out.printf("\t \t \t");
		System.out.println("CONTACT US");
		 System.out.println("You can contact us dear");
		   System.out.println();
		   System.out.printf("\t \t ");
		   System.out.printf("Phone Number:0555555555");
		   System.out.printf("\t \t ");
		   System.out.printf("Facebook:Palestinian Restaurant");
		   System.out.printf("\t \t ");
		   System.out.printf("Instagram:restaurant.ps");
	}
	
}