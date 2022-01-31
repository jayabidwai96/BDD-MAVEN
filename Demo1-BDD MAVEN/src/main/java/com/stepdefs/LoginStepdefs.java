package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {
	WebDriver driver;
	
	//Hooks in cucumber
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		
		driver.get("file:///C:/Users/jayab/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	  
	   
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();
	  
	   
	}

	@Then("^user will be on home page$")
	public void user_will_be_on_home_page() throws Throwable {
	  Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	   
	}
	@Then ("^user will see JBK logo$")
	public void user_will_see_JBK_logo() {
		WebElement logo = driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo.isDisplayed());
	}
	

	@Then("user will click register link")
    public void user_will_click_register_link() {


}



}
