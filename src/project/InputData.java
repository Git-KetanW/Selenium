package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputData {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	}
	public void sendData() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme 11X 5G");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		InputData obj=new InputData();
		obj.LaunchAUT();
		obj.sendData();

	}

}
