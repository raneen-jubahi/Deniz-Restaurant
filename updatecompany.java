package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import fall2022droject.Admin;
import fall2022droject.Company;

public class updatecompany{
	Admin admin;
	Company comp;
	
	public updatecompany(Company comp) {
		this.comp = comp;
		admin = new Admin("Haneen", "123");
	}
	@Given("admin is loggin")
	public void admin_is_loggin() {
		admin.login("Haneen","123");
	}


	@Given("i want to update company with name={string},phone={string},amount={string},and type={string}")
	public void i_want_to_update_company_with_name_phone_amount_and_type(String string, String string2, String string3, String string4) {
		 comp.setcomp("company2", "004594688","17", "bride");
	}

	@When("update phone number for company")
	public void update_phone_number_for_company() {
	   comp.updatePhoneCompany(comp,"0011856932");
	}

	@Then("update done")
	public void update_done() {
		 assertTrue(comp.isupdate);
	}
	@When("update amount")
	public void update_amount() {
	    comp.updateAmountCompany(comp,"20" );
	}
	
	@Given("admin is not loggin")
	public void admin_is_not_loggin() {
	    // Write code here that turns the phrase above into concrete actions
	 admin.logout();
	}

	@When("update company")
	public void update_company() {
		assertEquals(false,admin.isLogged());
		System.out.println("admin not login");
	}

}