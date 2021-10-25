import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickActions {
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//option[@value=\"Aurangabad\"]")).click();
		WebElement chkbox=driver.findElement(By.name("accept"));
		boolean a=chkbox.isSelected();
		System.out.println("is check box selected  "+a);
		chkbox.click();
		boolean b=chkbox.isSelected();
		System.out.println("is check box selected  "+b);
		WebElement getquote=driver.findElement(By.id("education_loan_btn"));
		boolean c=getquote.isEnabled();
		System.out.println("is button enabled  "+c);
		WebElement error=driver.findElement(By.id("Name_error"));
		boolean f=error.isDisplayed();
		System.out.println("is error message displayed    "+f);
		getquote.click();
		
		boolean d=error.isDisplayed();
		System.out.println("is error message displayed   "+d);
		String s=error.getText();
		System.out.println("error message is   "+s);
		
		
}
}
