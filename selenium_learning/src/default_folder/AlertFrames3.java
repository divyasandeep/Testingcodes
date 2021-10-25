import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AlertFrames3 {
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.findElement(By.id("accept-choices")).click();
		WebElement frm = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frm);
		WebElement ele = driver.findElement(By.xpath("  //select[@id='cars']"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Opel");

		WebElement first = s.getFirstSelectedOption();
		System.out.println("first selected element is    " + first.getText());
		List<WebElement> selectdOptions=s.getAllSelectedOptions();
		
		for(WebElement e:selectdOptions)
		{
			System.out.println("selected option is    "+e.getText());
		}
		 s.deselectAll();
				//s.deselectByIndex(0);
				//s.deselectByValue("saab");
				//s.deselectByVisibleText("Opel");
		List<WebElement> all=s.getOptions();
		for(WebElement e:all) {
			System.out.println("option is    "+e.getText());
			
			driver.findElement(By.xpath(" //input[@value='Submit']")).click();
			
			
		
			
			
}
}}