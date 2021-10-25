import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBoxes {
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("City"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("Aurangabad");
		s.selectByVisibleText("Bangalore");

		WebElement first = s.getFirstSelectedOption();
		System.out.println("first selected element is    " + first.getText());
		List<WebElement> selectdOptions = s.getAllSelectedOptions();

		for (WebElement e : selectdOptions) {
			System.out.println("selected option is    " + e.getText());
		}
		List<WebElement> all = s.getOptions();
		for (WebElement e : all) {
			System.out.println("option is    " + e.getText());

		}
	}
}
