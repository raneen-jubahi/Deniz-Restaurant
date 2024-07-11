package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import fall2022droject.Admin;
import fall2022droject.Company;

public class addcompany{
	Admin admin;
	Company comp;
	
	public addcompany(Company comp) {
		this.comp = comp;
		admin = new Admin("Haneen", "123");
	}
	
	@Given("admin is login")
	public void admin_is_login() {
		admin.login("Haneen","123");
	}

	@Given("i want to add company with name={string},phone={string},amount={string},and type={string}")
	public void i_want_to_add_company_with_name_phone_amount_and_type(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    comp.setcomp("company2", "004594688","17", "bride");
	}
	@When("add company")
	public void add_company() {
		comp.addcompany(comp);
	}

	@Then("add done")
	public void add_done() {
		////assertEquals(comp.isaddthecomp, true);
		 assertTrue(comp.isaddthecomp);
	}

	@Given("admin is not login")
	public void admin_is_not_login() {
	    admin.logout();
	}

	@Then("the {string} appear")
	public void the_appear(String string) {
		admin.logout();
		System.out.println("admin not login");
	}
	}

