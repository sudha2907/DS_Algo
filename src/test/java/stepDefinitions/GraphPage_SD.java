package stepDefinitions;

import com.pageObjects.GraphPage_PO;
import com.pageObjects.LoginPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;

public class GraphPage_SD {

	private GraphPage_PO gp = new GraphPage_PO(DriverFactory.getDriver());
	private LoginPage_PO lp = new LoginPage_PO(DriverFactory.getDriver());
	
	@When("The user clicks {string} sub link of Graph Page")
	public void the_user_clicks_sub_link_of_graph_page(String subLink) {
	    gp.subLinkClick(subLink);
	    Loggerload.info("Graph page - user clicks on submodule of graph page");
	}
	
	@Given("The user is on the {string} sub link of Graph page")
	public void the_user_is_on_the_sub_link_of_graph_page(String subLink) {
	    gp.subLinkClick(subLink);
	    Loggerload.info("Graph page - user is in the submodule page of graph module");
	}
	
	@Then("The user clicks Sign Out button")
	public void the_user_clicks_sign_out_button() {
		lp.clickLogoutBtn();
		Loggerload.info("Graph page - user clicks on signout button");
	}
}
