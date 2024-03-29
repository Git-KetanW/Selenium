package project;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class KeyboardScanEx1 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL");
		String url=sc.nextLine();
		System.out.println("Enter title");
		String exp=sc.nextLine();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String act=driver.getTitle();
		System.out.println(act);
		if(exp.equalsIgnoreCase(act)) {
			System.out.println("Both are Same");
		}
		else {
			System.out.println("Both are not same");
		}
		sc.close();
	}

	public static void main(String[] args) throws InterruptedException {
		KeyboardScanEx1 obj=new KeyboardScanEx1();
		obj.LaunchAUT();

	}

}
