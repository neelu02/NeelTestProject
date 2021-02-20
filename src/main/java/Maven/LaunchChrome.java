package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchChrome {
	WebDriver driver;

	@BeforeMethod
	public void setup() {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//. means current directory / means get inside
		driver = new ChromeDriver();  // launch empty browser
		driver.manage().window().maximize();  //maximize window
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is testcase1");
	}
	
	
	@AfterMethod
	public void tearDown()  {		
		driver.close();		
	}
	
	
}
