package project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindow {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Handle() throws InterruptedException {
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Admin area']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		for(String handle:allwindows) {
			if(!handle.equals(parent)) {
				
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='email']")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@yourstore.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='password']")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Log in']")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Logout")).click();
			}
		}
	}
	public void Back() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		MultiWindow obj=new MultiWindow();
		obj.LaunchAUT();
		obj.Handle();
		obj.Back();

	}

}
