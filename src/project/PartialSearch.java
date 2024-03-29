package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PartialSearch {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Search() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		act.sendKeys(srch, "Selenium").perform();
		Thread.sleep(2000);
		
		for(int i=0; i<7; i++) {
			act.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		act.sendKeys(Keys.ENTER).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		PartialSearch obj=new PartialSearch();
		obj.LaunchAUT();
		obj.Search();

	}

}
