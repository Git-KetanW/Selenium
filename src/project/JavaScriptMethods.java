package project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptMethods {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Title() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		String Ketu=jse.executeScript("return document.title;").toString();
		System.out.println("The Title is :"+Ketu);
		Thread.sleep(2000);
	}
	public void Alert() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("alert('Ketan ka automation, App ka Swagat Hai');");
		Thread.sleep(10000);
	}
	

	public static void main(String[] args) throws InterruptedException {
		JavaScriptMethods obj=new JavaScriptMethods();
		obj.LaunchAUT();
		obj.Title();
		obj.Alert();

	}

}
