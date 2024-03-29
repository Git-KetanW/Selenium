package project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//in this project we collect the evidence for the bug that observe during testing
public class Evidence { //this method for launch the webApplication by Automation
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public void SendData() throws InterruptedException {
		//this method is for providing some input to the login page
		driver.findElement(By.id("username")).sendKeys("ketanwalde123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
	}
	public void ScreenShot() throws IOException {
		//this method is for taking screenshot & save in expected location
		File abc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Source=new File("C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\Salesforce.jpg");
		FileHandler.copy(abc, Source);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Evidence obj=new Evidence();
		obj.LaunchAUT(); 
		obj.SendData();
		obj.ScreenShot();

	}

}
