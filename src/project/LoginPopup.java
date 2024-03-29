package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPopup {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void PopUp() throws InterruptedException {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
		act.sendKeys(search, "Mobile").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@loading='eager'])[1]")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		LoginPopup obj=new LoginPopup();
		obj.LaunchAUT();
		obj.PopUp();
		
	}

}
