package week4.day4assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
public static void main(String[] args) {
	ChromeDriver  driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	String title2=driver.getTitle();
	System.out.println(title2);
	driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("tamilselvi");
	driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("arul");
	driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("automation");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("none");
	driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("tamilselvi@gmail.com");
	WebElement dropDown = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
	Select drop=new Select(dropDown);
	drop.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("None");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.findElement(By.xpath("//div[text()='View Contact']")).click();
	String title3 = driver.getTitle();
	System.out.println(title3);
}
	
	}
