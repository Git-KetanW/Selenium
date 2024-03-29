package project;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class AddToCart {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver =new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Item() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Tablets'])[1]")).click();
		Thread.sleep(2000);
	}
	
	public void Cart() throws InterruptedException {
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]")).click();
		Set<String>windows=driver.getWindowHandles();
		for(String cart:windows) {
			if(!cart.equals(parent)) {
				driver.switchTo().window(cart);
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
			}
		}
	}
	
	public void Screenshot() throws IOException {
		File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Source=new File("C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\AddCart.jpg");
		FileHandler.copy(pic, Source);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		AddToCart obj=new AddToCart();
		obj.LaunchAUT();
		obj.Item();
		obj.Cart();
		
	}

}
