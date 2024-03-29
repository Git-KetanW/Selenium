package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		option.addArguments("--disable-gpu");
		
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		Thread.sleep(5000);
	}
	public void Sign_In() throws InterruptedException {
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("ketan.walde.1@gmail.com");//pass:- Ketan@2803
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Gmail obj=new Gmail();
		obj.LaunchAUT();
		obj.Sign_In();

	}

}
