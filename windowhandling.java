package week7.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leads {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	String title1 = driver.getTitle();
	System.out.println(title1);
	driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
	driver.findElement(By.xpath("//span[text()='From Lead']/following::img[1]")).click();
	 Set<String> child = driver.getWindowHandles();
	 List<String> open=new ArrayList<String>(child);
	 driver.switchTo().window(open.get(1));
	 driver.findElement(By.xpath("//div[contains(@class,'x-grid3-hd-inner')]/following::a[@class='linktext']")).click();
	 driver.switchTo().window(open.get(0));
	 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	 Set<String> child1 = driver.getWindowHandles();
	 List<String> open1=new ArrayList<String>(child1);
	 driver.switchTo().window(open1.get(1));
	 driver.findElement(By.xpath("//div[contains(@class,'x-grid3-hd-inner')]/following::a[@class='linktext']")).click();
	driver.switchTo().window(open1.get(0));
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	 Alert confirmalert = driver.switchTo().alert();
	 confirmalert.accept();
	 
}

	
}

