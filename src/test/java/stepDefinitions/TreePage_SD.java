package stepDefinitions;

import org.junit.Assert;

import com.pageObjects.TreePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;

public class TreePage_SD {
	
	TreePage_PO tm=new TreePage_PO(DriverFactory.getDriver());

	
	@Given("The user is on the {string} page of Tree module after logged in")
	public void the_user_is_on_the_after_logged_in(String submodule) {
	    tm.subModuleClick(submodule);
	    Loggerload.info("Tree page - user clicks on submodule of tree page");
	}
	@When("The user clicks on the {string} link of Tree page")
	public void the_user_clicks_on_the_link(String name) {
	    tm.subModuleClick(name);
	    Loggerload.info("Tree page - User is in the submodule page of tree module");
	}
	@Then("The user should be directed to {string} of tree Page")
	public void the_user_should_be_directed_to_of_tree_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
		Loggerload.info("Tree page - user should be directed to submodule of tree page");
	}
}
