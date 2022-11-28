package Package_MXPlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code_file {
	public String url="https://www.mxplayer.in/";
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;
	@BeforeTest
	public void BT() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void MXPlayer_testcase() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='add-to-mylist bc-atwl']//div)[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='mx_hamburger-container']")).click();
		test =extent.createTest("Testcase1");
		test.pass("Clicked on hamburger button ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='ham_item-title']")).click();
		test =extent.createTest("Testcase2");
		test.pass("Clicked on My List option");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='p__mlh-actions']/button")).click();
		test =extent.createTest("Testcase3");
		test.pass("Clicked on edit button");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Select All']")).click();
		test =extent.createTest("Testcase4");
		test.pass("Clicked on select all checkbox");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Discard']")).click();
		test =extent.createTest("Testcase5");
		test.pass("Clicked on discard option");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='p__ml-recommendations']/button/span")).click();
		test =extent.createTest("Testcase6");
		test.pass("Clicked on refresh button");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Settings']")).click();
		test =extent.createTest("Testcase7");
		test.pass("Clicked on settings button");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='p__scl-content']/div/div[3]/span")).click();
		test =extent.createTest("Testcase8");
		test.pass("Clicked on marathi checkbox option");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Set Languages']")).click();
		test =extent.createTest("Testcase9");
		test.pass("Clicked on set languages feature");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='profile']/ul/li[4]/span")).click();
		test =extent.createTest("Testcase10");
		test.pass("Clicked on help center option");
		
	}
	@AfterTest
	public void AT() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		extent.flush();
	}
	
	

}
