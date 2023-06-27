package stepDefinitions;

import com.pageObjects.StackPage_PO;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StackPage_SD {
	private StackPage_PO sp=new StackPage_PO(DriverFactory.getDriver());

	@When("The user clicks on the {string} link of Stack page")
	public void the_user_clicks_on_the_operations_in_stack_link(String module) throws InterruptedException {
		sp.subModuleClick(module);   
	 }

	@Given("The user is on the {string} page of Stack module after logged in")
	public void the_user_is_on_the_after_logged_in(String submodule) throws InterruptedException {
		 sp.subModuleClick(submodule);
	}

}
