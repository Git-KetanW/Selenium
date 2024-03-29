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

public class AddToCartEx1 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Macbook air m2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}
	public void Item() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Apple 2022 MacBook Air Laptop with M2 chip: 34.46 cm (13.6-inch) Liquid Retina Display, 8GB RAM, 256GB SSD Storage,"
				+ " Backlit Keyboard, 1080p FaceTime HD Camera. Works with iPhone/iPad; Starlight'])[1]")).click();
		Thread.sleep(2000);
	}
	public void Cart() throws InterruptedException {
		String parent=driver.getWindowHandle();
		Set<String>cart=driver.getWindowHandles();
		for(String mac:cart) {
			if(!mac.equals(parent)) {
				driver.switchTo().window(mac);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
				Thread.sleep(2000);
			}
		}
	}
	public void Screenshot() throws IOException, InterruptedException {
		Thread.sleep(2000);
		File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Source=new File("C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\AddCart.jpg");
		FileHandler.copy(pic, Source);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		AddToCartEx1 obj=new AddToCartEx1();
		obj.LaunchAUT();
		obj.Search();
		obj.Item();
		obj.Cart();
//		obj.Screenshot();

	}

}
