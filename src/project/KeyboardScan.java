package project;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardScan {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your URL");
		String URL=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		sc.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		KeyboardScan obj = new KeyboardScan();
		obj.LaunchAUT();

	}

}
