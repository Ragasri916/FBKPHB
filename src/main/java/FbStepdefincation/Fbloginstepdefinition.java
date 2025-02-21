package FbStepdefincation;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fbloginstepdefinition extends FBlogin {

	
		
			@Given("user is on login page")
				public static void user_is_on_login_page() throws Exception
				{
				Init_browser();
				Application_url(url);
				

				}



			@When("user enters valid username {string}")
			public static void user_enters_valid_username(String Emailid) throws IOException {
			  
				EnterEmailid(Emailid);
				String str=FBlogin.Takescreenshot();
				//ExtentCucumberAdapter.addTestStepLog("user is on login page");
				//ExtentCucumberAdapter.addTestStepScreenCaptureFromPath((String) FBlogin.Takescreenshot());
				//ExtentCucumberAdapter.addTestStepLog(" user is on login page");
				//ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(FBlogin.Takescreenshot());
				ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(str);
			}

			@When("user enters valid password {string}")
			public void user_enters_valid_password(String password) {
			   
				EnterPassword(password);
			}



			@And("clicks on submit")
			public static void clicks_on_submit()
			{
				Login();
			}

			



			@Then("user will navigated to home page")
			public static void user_will_navigated_to_home_page()
			{
				// if("Welcome to FB".equals(driver.gettitle())
				{
					//SOP("pass");
				}
			}

			

	


}
