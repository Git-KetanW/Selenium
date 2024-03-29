package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartEx1 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		
	}
	public void Get_Title() {
		String exp="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String act=driver.getTitle();
		System.out.println(act);
		if(exp.equalsIgnoreCase(act)) {
			System.out.println("both are same");
		} else {
			System.out.println("not same");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		StartEx1 obj=new StartEx1();
		obj.LaunchAUT();
		obj.Get_Title();

	}

}
