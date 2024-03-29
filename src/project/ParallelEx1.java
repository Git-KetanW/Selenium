package project;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelEx1 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		//get the Scanner class for taking input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=sc.nextLine();
	
		if(browser.equalsIgnoreCase("Edge")) {
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();	
		}
		if(browser.equalsIgnoreCase("Fire")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("Chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else {
			System.out.println("Invalid Browser");
		}
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		sc.close();
	}

	public static void main(String[] args) throws InterruptedException {
		ParallelEx1 obj=new ParallelEx1();
		obj.LaunchAUT();

	}

}
