package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vishwa {
	WebDriver driver;
	public void launchAut() throws InterruptedException {
	driver= new ChromeDriver();
	driver.get("http://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
	Vishwa ab=new Vishwa();
	ab.launchAut();

	}

}
