package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC001_FormSubmission extends DriverSetup{
	
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public void locatorLearnning() throws InterruptedException {

		
		//driver= instance
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("inputUsername")).sendKeys("Zinnia");
	
		driver.findElement(By.name("inputPassword")).sendKeys("zinnia123");
		Thread.sleep(3000);
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		// formula: tagname.value (if class is given)
		//            tagname#value (if id is given)
		
        driver.findElement(By.linkText("Forgot your password?")).click();
    	Thread.sleep(2000);
         
         
    	//tagname (@attribute'value)
    	
    	driver.findElement(By.xpath("//input[@placeholder= 'Name']")).sendKeys("abir");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//input[@placeholder= 'Email']")).sendKeys("test@gmail.com");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//input[@type= 'text'][3]")).sendKeys("01747106456");
    	Thread.sleep(2000);
    	
    	
    	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
    	Thread.sleep(2000);
       	
    	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tanvir");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
	}
}

