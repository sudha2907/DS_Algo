package stepDefinitions;

import io.cucumber.java.en.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.pageObjects.ArrayPage_PO;
import com.pageObjects.LinkedList_PO;
import com.qa.util.ExcelReader;
import com.qa.util.Loggerload;
import com.qa.factory.DriverFactory;


public class ArrayPage_SD extends TR_PF {
	
	ArrayPage_PO as = new ArrayPage_PO(DriverFactory.driver);
	TR_PF trpf = new TR_PF();
	String excelpath = "/Users/sara/Sudha Selenium Training/SampleExcel/DS-Algo/tryEditor.xlsx";
	String expectedcode;
	String actcode;
	String output;
	String result;
	private LinkedList_PO listpage = new LinkedList_PO(DriverFactory.getDriver());
	
	
	@Given("user clicks on the dropdown in array module")
	public void user_clicks_on_the_dropdown_in_array_module() throws InterruptedException {
	  as.dropdown();
	  as.array(); 
	  Loggerload.info("Array Page - user clicks on the dropdown in array module");
	  }

	@Given("user clicks on array in python submodule and user clicks on tryhere button")
	public void user_clicks_on_array_in_python_submodule_and_user_clicks_on_tryhere_button() throws InterruptedException {
	   as.Ain_pyth();
	   trpf.th();
	   Loggerload.info("Array Page - user clicks on array in python submodule and tryhere button");
	   }

	@When("user sends valid python code in try editor from excel sheet {string} and {int}")
	public void user_sends_valid_python_code_in_try_editor_from_excel_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		
		List<Map<String,String>> testData = reader.getData("./src/test/resources/TestData/tryEditor.xlsx", Sheetname);
	    String Data = testData.get(RowNumber).get("testData");
	    listpage.enterDataToTryEditor(Data);
	    Loggerload.info("Array Page - user sends valid python code from excel sheet");
		}
	
	@Then("user clicks on run button and user get the output in the console")
	 	public void user_clicks_on_run_button_and_user_get_the_output_in_the_console() {
	    trpf.run();
	    as.ar_output();
	    DriverFactory.refresh();
	    trpf.clear1(); 
	    Loggerload.info("Array Page - user clicks run button and checks output");
	    }

	@Given("user sends invalid syntax in try editor from excel sheet {string} and {int}")
	public void user_sends_invalid_syntax_in_try_editor_from_excel_sheet_and(String Sheetname, Integer RowNumber) throws InterruptedException, InvalidFormatException, IOException {
		trpf.clear1();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = reader.getData("./src/test/resources/TestData/tryEditor.xlsx", Sheetname);
	    String Data = testData.get(RowNumber).get("testData");
	    listpage.enterDataToTryEditor(Data);
	    Loggerload.info("Array Page - user sends invalid python code from excel sheet");
		}
			
	@When("user clicks on run button")
	public void user_clicks_on_run_button() throws InterruptedException {
		trpf.run();	
		Loggerload.info("Array Page - user clicks run button");
		}

	@Then("user gets the alert message and navigates back")
	public void user_gets_the_alert_message_and_navigates_back() throws InterruptedException {
		DriverFactory.getAlertMsg();
	    DriverFactory.navigateback();	
	    Loggerload.info("Array Page - user checks alert message and navigates back");
	   }

	@Given("user clicks on array using list submodule and user clicks on tryhere button")
	public void user_clicks_on_array_using_list_submodule_and_user_clicks_on_tryhere_button() {
	   as.ar_list();
	   trpf.th();
	   Loggerload.info("Array Page - user clicks on array using list submodule and tryhere button");
	   }

	@Then("user clicks on run button and capture the output in console")
	public void user_clicks_on_run_button_and_capture_the_output_in_console() throws InterruptedException {
	   trpf.run();
	   as.ar_output();	
	   DriverFactory.refresh(); 
	   Loggerload.info("Array Page - user clicks run button and checks output");
	   }

	@Given("user clicks on Basic operations in list and user clicks on tryhere button")
	public void user_clicks_on_basic_operations_in_list_and_user_clicks_on_tryhere_button() {
	   as.ar_oper();
	   trpf.th();	
	   Loggerload.info("Array Page - user clicks on Basic operations in list and clicks tryhere button");
	   }   

	@Given("user clicks on Application of array and user clicks on tryhere button")
	public void user_clicks_on_application_of_array_and_user_clicks_on_tryhere_button() {
	   as.app_ar();
	   trpf.th();	
	   Loggerload.info("Array Page - user clicks on Application of array and clicks tryhere button");
	   }

	@Given("user clicks on Practice Question")
	public void user_clicks_on_practice_question() {
	   as.a_PQ();
	   Loggerload.info("Array Page - user clicks on Practice Question");
	   }

	@When("user clicks on search the array and clear the try editor")
	public void user_clicks_on_search_the_array_and_clear_the_try_editor() {
	   as.a_PQ1();
	   trpf.clear1(); 
	   Loggerload.info("Array Page - user clicks on search the array and clear the try editor");
	   }
	
	@Then("user clicks on submit button and capture the output in console")
	public void user_clicks_on_submit_button_and_capture_the_output_in_console() throws InterruptedException {
	   Thread.sleep(1000);
	   as.submit();
	   Thread.sleep(1000);
	   as.ar_output();	
	   DriverFactory.refresh();
	   Loggerload.info("Array Page - user clicks submit button and checks output");
	   }
	
	@Given("user clicks on max consecutive ones and clear the try editor")
	public void user_clicks_on_max_consecutive_ones_and_clear_the_try_editor() throws InterruptedException {
	   as.a_PQ2();
	   Thread.sleep(1000);
	   trpf.clear1();
	   Loggerload.info("Array Page - user clicks on max consecutive ones and clear the try editor");
	   }

	@Given("user clicks on Find numbers with even number of digits and clear the try editor")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_and_clear_the_try_editor() throws InterruptedException {
		as.a_PQ3();
		Thread.sleep(1000);
		trpf.clear1();
		Loggerload.info("Array Page - user clicks on Find numbers with even number of digits and clear the try editor");
		}

	@Given("user clicks on the squares of sorted array and clear the try editor")
	public void user_clicks_on_the_squares_of_sorted_array_and_clear_the_try_editor() throws InterruptedException {
	   as.a_PQ4();
	   Thread.sleep(1000);
	   trpf.clear1();
	   Loggerload.info("Array Page - user clicks on the squares of sorted array and clear the try editor");
	   }
}
	
