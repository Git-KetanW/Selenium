package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelEx2 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		String[] browser= {"Chrome", "Fire", "Edge"};
		for(String browsers:browser) {
			
			if(browsers.equalsIgnoreCase("Chrome")) {
				driver=new ChromeDriver();
				driver.get("http://www.amazon.in/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
			}
			else if(browsers.equalsIgnoreCase("Edge")) {
				driver=new EdgeDriver();
				driver.get("http://www.amazon.in/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
			}
			else if(browsers.equalsIgnoreCase("Fire")) {
				driver=new FirefoxDriver();
				driver.get("http://www.flipkart.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
			}
			else {
				System.out.println("Invalid browser");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ParallelEx2 obj=new ParallelEx2();
		obj.LaunchAUT();

	}

}
