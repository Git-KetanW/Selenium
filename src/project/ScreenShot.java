package project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException, IOException {
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Source=new File("C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\vishwa.jpg");
	FileHandler.copy(pic, Source);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		ScreenShot obj=new ScreenShot();
		obj.LaunchAUT();

	}

}
