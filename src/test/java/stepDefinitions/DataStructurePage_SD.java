package stepDefinitions;

import com.pageObjects.DataStructurePage_PO;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.*;


public class DataStructurePage_SD extends TR_PF {

	DataStructurePage_PO ds = new DataStructurePage_PO(DriverFactory.getDriver());
	TR_PF trpf = new TR_PF();
	
	@Given("User is clicks on Datastructuregetstarted button")
	public void user_is_clicks_on_datastructuregetstarted_button() {
	    ds.getStarted_ds();
	}

	@When("user clicks on time complexity sub module")
	public void user_clicks_on_time_complexity_sub_module() {
	    ds.timecomplex();
	}

	@Then("user clicks on tryhere button")
	public void user_clicks_on_tryhere_button() {
		trpf.th();
	}

	@Given("user sends valid pythoncode and click on run button and print the output in console")
	public void user_sends_valid_pythoncode_and_click_on_run_button_and_print_the_output_in_console() {
	    ds.dsinput1();
	    trpf.run();
	    ds.dsoutput1();
	}

	@When("user navigates refresh")
	public void user_navigates_refresh() {
	    DriverFactory.refresh();
	}

	@Then("user sends invalid syntax and click on run button and capture the alert messsage")
	public void user_sends_invalid_syntax_and_click_on_run_button_and_capture_the_alert_messsage() {
	    ds.dsinvalidinput();
	    trpf.run();
	    DriverFactory.getAlertMsg();
	}

	@Then("user navigates back")
	public void user_navigates_back() {
		 DriverFactory.navigateback();
	}

	@Given("user clicks on practice Questions")
	public void user_clicks_on_practice_questions() {
	    ds.dspracticeQ();
	}

	@Then("uset navigates back")
	public void uset_navigates_back() throws InterruptedException {
	    DriverFactory.navigateback();
	    Thread.sleep(3000);	
	}

}
