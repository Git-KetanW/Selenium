package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Popups {
	WebDriver driver;
	String url="https://www.indiehackers.com/sign-in";
	By reset=By.linkText("Reset");
	
	public void LaunchAUT() throws InterruptedException {
		driver=new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void Click_Ok() throws InterruptedException {
		driver.findElement(reset).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void Cancle() throws InterruptedException {
		driver.findElement(reset).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	
	public void InputData() throws InterruptedException {
		driver.findElement(reset).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("ketan@gmail.com");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void GetText() throws InterruptedException {
		driver.findElement(reset).click();
		Thread.sleep(2000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws InterruptedException {
		Popups obj=new Popups();
		obj.LaunchAUT();
		obj.Click_Ok();
		obj.Cancle();
		obj.InputData();
		obj.GetText();

	}

}
