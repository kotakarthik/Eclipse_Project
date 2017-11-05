package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScripts {
	
	WebDriver driver;


	@Before
	public void firingtheBrowser() {
		
	
		System.out.println("opening the browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	
	@After
	
	public void tearDown() {
		System.out.println("closing the browser");
		driver.quit();
		System.out.println("closed the browser");
	}
	
@Given("^open facebook login page in chrome$")
public void open_facebook_login_page_in_chrome() throws Throwable {
	
	driver.get("https://www.facebook.com/login/");
	//driver.manage().window().maximize();
	
}

@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")

public void i_enter_valid_and_valid(String uname, String pass) throws Throwable {
	
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pass);
}

@Then("^User should  able to login$")
public void User_should_able_to_login() throws Throwable {

	driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
}

}
