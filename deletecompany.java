package fall2022droject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import fall2022droject.Admin;
import fall2022droject.Company;

public class deletecompany{
	Admin admin;
	Company comp;
	
	public deletecompany(Company comp) {
		this.comp = comp;
		admin = new Admin("Haneen", "123");
	}
	
	@Given("admin is loginn")
	public void admin_is_loginn() {
		admin.login("Haneen","123");
	}

	@Given("i want to delete company with name={string},phone={string},amount={string},and type={string}")
	public void i_want_to_delete_company_with_name_phone_amount_and_type(String string, String string2, String string3, String string4) {
		 comp.setcomp("company2", "004594688","17", "bride");
	}

	@When("delete company")
	public void delete_company() {
	   comp.deletecompany(comp);
	}

	@Then("delete done")
	public void delete_done() {
		assertEquals(false,comp.isaddthecomp);
	}

	@Given("admin is not loginn")
	public void admin_is_not_loginn() {
	    admin.logout();
	}

	@Then("the {string} printf on screen")
	public void the_printf_on_screen(String string) {
		admin.logout();
		comp.isaddthecomp=true;
		assertEquals(true,comp.isaddthecomp);
		System.out.println("admin not login");
	}
}