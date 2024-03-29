package project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Emplicity_ {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void Refresh() {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0)");
	}
	public void Explicit() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Lighting solutions']")));
		we.click();
	}

	public static void main(String[] args) {
		Emplicity_ obj=new Emplicity_();
		obj.LaunchAUT();
		obj.Refresh();
		obj.Explicit();

	}

}
