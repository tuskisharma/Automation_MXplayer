package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition_file {
	public static String url="https://www.mxplayer.in/";
	WebDriver driver;
	@Given("I should be in MXPlayer Homepage")
	public void i_should_be_in_mx_player_homepage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='add-to-mylist bc-atwl']//div)[1]")).click();
		
	}
	@When("Click on Settings feature")
	public void click_on_settings_feature() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='mx_hamburger-container']")).click();
	    
	}
	@When("Click on My List feature")
	public void click_on_my_list_feature() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='ham_item-title']")).click();
		Thread.sleep(5000);
	    	}
	@When("Click on Edit button on My List")
	public void click_on_edit_button_on_my_list() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='p__mlh-actions']/button")).click();
		Thread.sleep(5000);
	}
	@When("Click on select all checkbox")
	public void click_on_select_all_checkbox() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Select All']")).click();
		Thread.sleep(5000);

	    	}
	@Then("Click on Discard")
	public void click_on_discard() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Discard']")).click();
		Thread.sleep(3000);

	    	}
	@When("Click on Edit button again")
	public void click_on_edit_button_again() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='p__mlh-actions']/button")).click();
		Thread.sleep(5000);
	}
	@When("Click on select all checkbox again")
	public void click_on_select_all_checkbox_again() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Select All']")).click();
		Thread.sleep(5000);
	}
	@Then("Click on Delete")
	public void click_on_delete() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@class='p__mlh-actions']/button[3]/span")).click();
	    Thread.sleep(3000);
	    driver.close();
	}

	    	}
