package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SourceCode {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Refresh() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0);");
		Thread.sleep(2000);
	}
	public void Highlight() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		WebElement highlight=driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].style='border:5px solid red'", highlight);
		Thread.sleep(4000);
	}
	public void Source() {
		jse=(JavascriptExecutor)driver;
		String Code=jse.executeScript("return document.documentElement.innerText").toString();
		System.out.println("The Source code is: "+Code);
	}

	public static void main(String[] args) throws InterruptedException {
		SourceCode obj=new SourceCode();
		obj.LaunchAUT();
		obj.Refresh();
		obj.Highlight();
		obj.Source();

	}

}
