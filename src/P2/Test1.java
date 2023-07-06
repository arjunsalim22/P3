package P2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import P1.Page1;

public class Test1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");	
		}
	@Test
	public void testing() throws InterruptedException
	{
		Page1 ob=new Page1(driver);
		Thread.sleep(3000);
		ob.acc();
		Thread.sleep(3000);
		ob.reg();
		Thread.sleep(3000);
		ob.first("arjun");
		Thread.sleep(3000);
		ob.last("salim");
		Thread.sleep(3000);
		ob.eml("arjunsalim22@gmail.com");
		Thread.sleep(3000);
		ob.tel("7034784389");
		Thread.sleep(3000);
		ob.password("Arjun@123");
		Thread.sleep(3000);
		ob.passconfirm("Arjun@123");
		Thread.sleep(3000);
		ob.checckbox();
		Thread.sleep(3000);
		ob.contin();
		Thread.sleep(3000);
		ob.contin1();
		
		
	}


}
