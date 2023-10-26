package week4.day4assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {
public static void main(String[] args) {
	ChromeDriver  driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	//driver.findElement(By.xpath(']")).sendKeys("tamilselvi");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
}
}
