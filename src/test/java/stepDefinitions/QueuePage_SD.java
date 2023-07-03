package stepDefinitions;

import com.pageObjects.QueuePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class QueuePage_SD {

	private QueuePage_PO qp = new QueuePage_PO(DriverFactory.getDriver());

	@When("The user clicks on {string} link of Queue page")
	public void the_user_clicks_on_link(String module) {
	    qp.subModuleClick1(module);
	    Loggerload.info("Queue page - user clicks on submodule of queue page");
	}

	@Given("The user is on the {string} page in queue after logged in")
	public void the_user_is_on_the_page_in_queue_after_logged_in(String module) {
		qp.subModuleClick1(module);
		Loggerload.info("Queue page - user clicks on submodule of queue page");
	}
}