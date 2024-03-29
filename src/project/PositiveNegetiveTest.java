package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveNegetiveTest {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Test(String username, String password) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(1500);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.id("Login")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		PositiveNegetiveTest obj=new PositiveNegetiveTest();
		obj.LaunchAUT();
		obj.Test("ketan@gmail.com", "Ketan");
		obj.Test("ketan123@gmail.com", "somthing");
		obj.Test("walde13@gmail,com", "roww");

	}

}
