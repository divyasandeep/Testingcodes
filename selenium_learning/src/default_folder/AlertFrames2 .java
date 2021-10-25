import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertFrames2 
{

	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.javascripter.net/faq/confirm.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Try it now']")).click();
		Alert a = driver.switchTo().alert();
		
		a.dismiss();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
}}