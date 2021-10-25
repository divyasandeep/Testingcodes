import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBoxes3 {
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("Andean");
		s.selectByVisibleText("Chilean flamingo");

		WebElement first = s.getFirstSelectedOption();
		System.out.println("first selected element is    " + first.getText());
		List<WebElement> selectdOptions=s.getAllSelectedOptions();
		
		for(WebElement e:selectdOptions)
		{
			System.out.println("selected option is    "+e.getText());
		}
		 s.deselectAll();
				//s.deselectByIndex(0);
				//s.deselectByValue("option8");
				//s.deselectByVisibleText("Option 9");
		List<WebElement> all=s.getOptions();
		for(WebElement e:all) {
			System.out.println("option is    "+e.getText());
		
}
}}
