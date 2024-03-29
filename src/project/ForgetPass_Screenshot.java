package project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgetPass_Screenshot {
	WebDriver driver;
	public void LaunchAUT() {
		driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void forget() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.id("forgot_password_link")).click();
		
		driver.findElement(By.id("un")).sendKeys("somthing@nothing.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue"))).click();	
	}
	public void Screenshot() throws IOException {
		File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File source=new File("C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\first.jpg");
		FileHandler.copy(image, source);
		
		driver.findElement(By.xpath("//a[text()='Return to Login']")).click();
	}
	

	public static void main(String[] args) throws IOException {
		ForgetPass_Screenshot obj=new ForgetPass_Screenshot();
		obj.LaunchAUT();
		obj.forget();
		obj.Screenshot();
	}

}
