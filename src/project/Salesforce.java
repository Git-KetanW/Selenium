package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//program done by using XPath only

public class Salesforce {
	WebDriver driver;
	public void LauchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void InputData() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Ketan");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Rana");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("ketan@gmail.com");
		Thread.sleep(1500);
	}
	public void Employment() throws InterruptedException {
		WebElement emp=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select obj=new Select(emp);
		Thread.sleep(1500);
		obj.selectByValue("IT_Manager_AP");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("HCL");
		Thread.sleep(1500);
	}
	public void Details() throws InterruptedException {
		WebElement count=driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select obj1=new Select(count);
		Thread.sleep(1500);
		obj1.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("1234567890");
		Thread.sleep(1500);
		WebElement country=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select obj2=new Select(country);
		Thread.sleep(1500);
		obj2.selectByValue("IN");
	}
	public void Submit() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@name='start my free trial']")).click();
	}
			
	public static void main(String[] args) throws InterruptedException {
		Salesforce obj=new Salesforce();
		obj.LauchAUT();
		obj.InputData();
		obj.Employment();
		obj.Details();
		obj.Submit();

	}

}
