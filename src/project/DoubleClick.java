package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	WebDriver driver;
	JavascriptExecutor jse;
	Actions act;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void clickDouble() throws InterruptedException {
		act=new Actions(driver);
		driver.switchTo().frame("iframeResult");
		WebElement clik=driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		Thread.sleep(2000);
		act.doubleClick(clik).perform();
		
		//for printing "Hello World"
		String text=driver.findElement(By.xpath("//p[text()='Hello World ']")).getText();
		System.out.println(text);
	}
	public void TearDown() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		DoubleClick obj=new DoubleClick();
		obj.LaunchAUT();
		obj.clickDouble();
		obj.TearDown();
		

	}

}
