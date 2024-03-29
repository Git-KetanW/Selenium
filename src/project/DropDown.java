package project;
/*this program is use for automate the Salesforce - Try for free page*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void InputData() throws InterruptedException {
		driver.findElement(By.name("UserFirstName")).sendKeys("Ketan");
		Thread.sleep(1500);
		driver.findElement(By.name("UserLastName")).sendKeys("Walde");
		Thread.sleep(1500);
		driver.findElement(By.name("UserEmail")).sendKeys("ketan@gmail.com");
		Thread.sleep(1500);
	}
	public void JobTitle() throws InterruptedException {
		WebElement DD=driver.findElement(By.name("UserTitle"));
		org.openqa.selenium.support.ui.Select obj=new Select(DD);
		Thread.sleep(2000);
		//here we using .selectByValue for select option
		obj.selectByValue("Customer_Service_Manager_ANZ");
	}
	
	public void Company() throws InterruptedException {
		driver.findElement(By.name("CompanyName")).sendKeys("IBM");
		Thread.sleep(2000);
		
		//This drop-down automate for Employees 
		
		WebElement emp=driver.findElement(By.name("CompanyEmployees"));
		Select obj1=new Select(emp);
		Thread.sleep(2000);
		//here we using .selectByIndex for select option
		obj1.selectByIndex(4);
		
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		
		WebElement Country=driver.findElement(By.name("CompanyCountry"));
		Select obj2=new Select(Country);
		Thread.sleep(2000);
		obj2.selectByValue("IN");
	}
	
	public void Submit() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("start my free trial")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		DropDown obj=new DropDown();
		obj.LaunchAUT();
		obj.InputData();
		obj.JobTitle();
		obj.Company();
		obj.Submit();

	}

}
