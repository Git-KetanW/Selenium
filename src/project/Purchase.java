package project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Purchase {
	WebDriver driver;
	Scanner sc = new Scanner(System.in);
	public void LaunchAUT() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
	public void Item() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		Thread.sleep(2000);
	}
	public void Check_Out() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		Thread.sleep(2000);
		
		//personal info
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Mac");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		Purchase obj = new Purchase();
		obj.LaunchAUT();
		obj.Login();
		obj.Item();
		obj.Check_Out();
		
	}

}
