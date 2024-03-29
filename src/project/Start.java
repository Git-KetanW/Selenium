package project;

import org.openqa.selenium.*;  //package for WebDriver
import org.openqa.selenium.chrome.ChromeDriver;  //package for Chrome Driver

public class Start {
	public void LaunchAUT() throws InterruptedException {
		
		//here we set the key & value
		System.setProperty("wemdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//create common WebDriver & Chrome Driver object
		WebDriver driver=new ChromeDriver();
		
		//launch the application
		driver.get("https://www.flipkart.com/");
		
		//maximize the screen of application
		driver.manage().window().maximize();
		
		//application screen close after timer
		Thread.sleep(2000);
		
		//close the application
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Start obj=new Start();
		obj.LaunchAUT();

	}

}
