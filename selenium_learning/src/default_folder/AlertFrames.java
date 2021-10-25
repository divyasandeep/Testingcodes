package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettitleGetcurrentURL {

	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stats.espncricinfo.com/ci/engine/records/index.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		try {
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		catch(Exception e)
		{
			
		}
		String a=driver.getTitle();
		System.out.println("title is   "+a);
		String b=driver.getCurrentUrl();
		System.out.println("url is   "+b);
		driver.findElement(By.linkText("STATSGURU")).click();
		Thread.sleep(4000);
		String c=driver.getTitle();
		System.out.println("title is   "+c);
		String d=driver.getCurrentUrl();
		System.out.println("url is   "+d);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		
	}

}
