import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame4 {
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://docs.checkout.com/integrate/frames");
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(
				By.xpath(" //iframe[@src='https://assets.checkout.com/docs/examples/1liner-new/index.html']"));
		driver.switchTo().frame(frm);
		WebElement frame = driver.findElement(By.id("singleIframe"));
		driver.switchTo().frame(frame);
		WebElement ccNumber = driver.findElement(By.id("checkout-frames-card-number"));

		ccNumber.sendKeys("4242 4242 4242 4242");

		WebElement expdate = driver.findElement(By.id("checkout-frames-expiry-date"));
		expdate.sendKeys("01/28");

		WebElement cvvNumber = driver.findElement(By.id("checkout-frames-cvv"));
		cvvNumber.sendKeys("100");
		driver.switchTo().parentFrame();

		driver.findElement(By.id("pay-button")).click();
		Thread.sleep(4000);
		String token = driver.findElement(By.className("token")).getText();
		System.out.println("token is   " + token);
		driver.switchTo().defaultContent();

	}
}
