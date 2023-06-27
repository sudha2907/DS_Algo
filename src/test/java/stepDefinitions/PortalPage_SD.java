package stepDefinitions;

import org.junit.Assert;
import com.pageObjects.PortalPage_PO;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.*;

public class PortalPage_SD {
	
	//public WebDriver driver;
	private PortalPage_PO portalPage = new PortalPage_PO(DriverFactory.getDriver());
	
	@Given("user opens portal page")
	public void user_opens_portal_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}

	@When("user clicks Get Started button")
	public void user_clicks_get_started_button() {
	    portalPage.getStarted();
	}

	@Then("user should go to home page")
	public void user_should_go_to_home_page() {
	    String loginPageTitle = portalPage.getLoginPageTile();
	    System.out.println("DS-Algo login page is " + loginPageTitle);
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String loginPageTitle = portalPage.getLoginPageTile();
		Assert.assertTrue(loginPageTitle.contains(expectedTitle));
	}

}
