package stepDefinitions;

import com.pageObjects.DataStructurePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;


public class DataStructurePage_SD extends TR_PF {

	DataStructurePage_PO ds = new DataStructurePage_PO(DriverFactory.getDriver());
	TR_PF trpf = new TR_PF();
	
	@Given("User is clicks on Datastructuregetstarted button")
	public void user_is_clicks_on_datastructuregetstarted_button() {
	    ds.getStarted_ds();
	    Loggerload.info("DataStructures Page - user clicks get started button");
	}

	@When("user clicks on time complexity sub module")
	public void user_clicks_on_time_complexity_sub_module() {
	    ds.timecomplex();
	    Loggerload.info("DataStructures Page - clicks on sub module");
	}

	@Then("user clicks on tryhere button")
	public void user_clicks_on_tryhere_button() {
		trpf.th();
		Loggerload.info("DataStructures Page - clicks on tryhere button");
	}

	@Given("user sends valid pythoncode and click on run button and print the output in console")
	public void user_sends_valid_pythoncode_and_click_on_run_button_and_print_the_output_in_console() {
	    ds.dsinput1();
	    trpf.run();
	    ds.dsoutput1();
	    Loggerload.info("DataStructures Page - sends valid code and click run button");
	}

	@When("user navigates refresh")
	public void user_navigates_refresh() {
	    DriverFactory.refresh();
	    Loggerload.info("DataStructures Page - navigates to refresh");
	}

	@Then("user sends invalid syntax and click on run button and capture the alert messsage")
	public void user_sends_invalid_syntax_and_click_on_run_button_and_capture_the_alert_messsage() {
	    ds.dsinvalidinput();
	    trpf.run();
	    DriverFactory.getAlertMsg();
	    Loggerload.info("DataStructures Page - sends invalid code, clicks run button and clicks alert");
	}

	@Then("user navigates back")
	public void user_navigates_back() {
		 DriverFactory.navigateback();
		 Loggerload.info("DataStructures Page - navigates back");
	}

	@Given("user clicks on practice Questions")
	public void user_clicks_on_practice_questions() {
	    ds.dspracticeQ();
	    Loggerload.info("DataStructures Page - clicks on practice questions");
	}

}
