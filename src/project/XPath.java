//project creating for XPath demonstration

package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	//using XPath for automate
	public void Search() throws InterruptedException {
		//XPath expression tagname[@attribute='value']
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("How to hack the mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	}
	
	public void Result() {
		driver.findElement(By.xpath("//h3[text()='Mobile phone hacking explained and what to do if it happens ...']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		XPath obj=new XPath();
		obj.LaunchAUT();
		obj.Search();
		obj.Result();

	}

}
