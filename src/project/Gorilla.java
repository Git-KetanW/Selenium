package project;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gorilla {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the count of repeatation");
	int count=sc.nextInt();
	for(int i=0; i<=count; i++) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	sc.close();
		
	}
	public static void main(String[] args) throws InterruptedException {
		Gorilla obj=new Gorilla();
		obj.LaunchAUT();
		
	}

}
