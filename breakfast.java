package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class breakfast{
	
	
	public breakfast() {
		
	}
	
	@Given("the user wont to know what the beakfast")
	public void the_user_wont_to_know_what_the_beakfast() {
	}

	@When("press breakfast")
	public void press_breakfast() {
	}

	@Then("Print information about our breakfast")
	public void print_information_about_our_breakfast() {
		   System.out.println("Omelette, fried cheese, hummus, fried tomatoes, labneh, makdous, pickles, turkey, falafel and teapot \n Price for two people 50 shekels");

	}


}