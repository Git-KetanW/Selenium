package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

	public static void main(String[] args) throws InterruptedException {
		Whatsapp obj=new Whatsapp();
		obj.LaunchAUT();

	}

}
