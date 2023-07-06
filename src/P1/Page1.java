package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1 {
	
	WebDriver driver;
	By account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
	By registr=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By firstname=By.xpath("//*[@id=\"input-firstname\"]");
	By lastnme=By.xpath("//*[@id=\"input-lastname\"]");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By tele=By.xpath("//*[@id=\"input-telephone\"]");
	By pass=By.xpath("//*[@id=\"input-password\"]");
	By passconf=By.xpath("//*[@id=\"input-confirm\"]");
	By check=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By cont=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By cont1=By.xpath("//*[@id=\"content\"]/div/div/a");


public Page1(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void acc()
{
	driver.findElement(account).click();
}
public void reg()
{
	driver.findElement(registr).click();
}
public void first(String f1)
{
	driver.findElement(firstname).sendKeys(f1);
}
public void last(String f2)
{
	driver.findElement(lastnme).sendKeys(f2);
}
public void eml(String f3)
{
	driver.findElement(email).sendKeys(f3);
}
public void tel(String f4)
{
	driver.findElement(tele).sendKeys(f4);
}
public void password(String f5)
{
	driver.findElement(pass).sendKeys(f5);
}
public void passconfirm(String f6)
{
	driver.findElement(passconf).sendKeys(f6);
}
public void checckbox()
{
	WebElement radio1=driver.findElement(check);
	radio1.click();
	boolean s= radio1.isSelected();
	System.out.println(s);
}
public void contin()
{
	driver.findElement(cont).click();
}
public void contin1()
{
	driver.findElement(cont1).click();
}
}
