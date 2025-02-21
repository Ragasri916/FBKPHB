package fbrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Fblogin"},
glue = {"Fbloginstepdefinition"},
plugin = {"pretty",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
 monochrome = true )

public class Fbrunner extends AbstractTestNGCucumberTests {

}
