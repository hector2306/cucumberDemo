package stepDefinitions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FacebookTest {
	WebDriver driver;
	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		WebDriverManager.chromedriver().browserVersion("83.0.4103.39").setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).sendKeys("hola");;
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		driver.findElement(By.id("pass")).sendKeys("hjj");
	}

	@Then("Login should fail")
	public void login_should_fail() {
		driver.findElement(By.id("u_0_b")).submit();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		//Assert.assertEquals("Facebook - log in or sign up", title);
		
	 }

}
