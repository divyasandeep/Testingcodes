import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBoxActions {
	

		public WebDriver driver;

		@Test
		public void chromePrg() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gumudell\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.deal4loans.com/apply-education-loans.php");
			driver.manage().window().maximize();
			WebElement FullName= driver.findElement(By.id("Name"));
             FullName.sendKeys("divya enugutala");
             String a = FullName.getAttribute("value");
     		System.out.println("value in the text box is   " + a);
     		String q = FullName.getAttribute("onkeypress");
     		System.out.println("onkeypress value is   " + q);
    		WebElement EmailID= driver.findElement(By.name("Email"));
    		EmailID.sendKeys("divyaenugutala@gmail.com");
    		String b =EmailID.getAttribute("value");
    		System.out.println("Email value is "+ b);
    		Thread.sleep(2000);
    		EmailID.clear();
    		
    		String c = EmailID.getAttribute("value");
    		System.out.println("Value in the textbox is"+ c);
    		String d=EmailID.getAttribute("class");
    		System.out.println("class attribute value is"+d);
    		String r = EmailID.getAttribute("autocomplete");
     		System.out.println("autocomplete value is   " + r);
    		WebElement MobileNumber = driver.findElement(By.name("Phone"));
    		MobileNumber.sendKeys("07477963337");
    		String e =MobileNumber.getAttribute("value");
    		System.out.println("Phone Number is "+ e);
    		Thread.sleep(2000);
    		MobileNumber.clear();
    		String f = MobileNumber.getAttribute("value");
    		System.out.println("Value in the textbox is"+ f);
    		String g=MobileNumber.getAttribute("class");
    		System.out.println("class attribute value is"+g);
    		String s = MobileNumber.getAttribute("onchange");
     		System.out.println("onchange value is   " + s);
    		WebElement CourseName = driver.findElement(By.name("Course_Name"));
    		CourseName.sendKeys("cse");
    		String h =CourseName.getAttribute("value");
    		System.out.println("course name is is "+ h);
    		Thread.sleep(2000);
    		CourseName.clear();
    		String i= CourseName.getAttribute("value");
    		System.out.println("course name in the textbox is"+ i);
    		String j=CourseName.getAttribute("class");
    		System.out.println("class attribute value is"+j);
    		String t = CourseName.getAttribute("autocomplete");
     		System.out.println("autocomplete value is   " + t);
    		WebElement CoborrowersIncome = driver.findElement(By.name("Coborrower_Income"));
    		CoborrowersIncome.sendKeys("10000");
    		String k =CoborrowersIncome.getAttribute("value");
    		System.out.println("coborrowers income is "+ k);
    		Thread.sleep(2000);
    		CoborrowersIncome.clear();
    		String l= CoborrowersIncome.getAttribute("value");
    		System.out.println("Value in the textbox is"+ l);
    		String m=CoborrowersIncome.getAttribute("class");
    		System.out.println("class attribute value is"+m);
    		WebElement RequiredLoanAmount = driver.findElement(By.name("Loan_Amount"));
    		RequiredLoanAmount.sendKeys("5000");
    		String n =RequiredLoanAmount.getAttribute("value");
    		System.out.println("Required loan amount is "+ n);
    		Thread.sleep(2000);
    		RequiredLoanAmount.clear();
    		String o= RequiredLoanAmount.getAttribute("value");
    		System.out.println("Value in the textbox is"+ o);
    		String p=RequiredLoanAmount.getAttribute("class");
    		System.out.println("class attribute value is"+p);
    		
    		
             
		}}
