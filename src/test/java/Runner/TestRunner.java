package Runner;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue= "stepDefinations",plugin= {"html:target/cucumber-html-report"},tags= {"@FacebookLogin"},monochrome=true)

//"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"

public class TestRunner {
	
	
	@BeforeClass
	public static void setup() {
		
		  // User can add the system information as follows
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		    extentProperties.setReportPath("target/myreport.html");
	
	
    	    }
	
	
    	    }
	


