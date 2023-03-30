package Practice;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest {

	@Test
	
	public void SampleTestScript()
	{
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/resources/log4j.properties");
		System.out.println("SampleTestScript");
		
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\other";
		
		System.out.println(otherFolder);
	String exePath = "/ProjectSample/geckodriver.exe";
		
	System.setProperty("webdriver.gecko.driver", exePath);
		
		WebDriverManager.firefoxdriver().setup();

		
		
		//FirefoxOptions options = new FirefoxOptions();
	//	options.setBinary("C:\\WE+A1\\CoreJava\\ProjectSample\\geckodriver.exe"); //Location where Firefox is installed


		
	//	ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		options.setAcceptInsecureCerts(true);
//		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//			
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
//		options.merge(capabilities);

		WebDriverManager.firefoxdriver().setup();
	 WebDriver	driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.get("https://expired.badssl.com/");
		
		
		
		
		
		
		

	//	WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.instagram.com/");
		//Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("7385960369");
		driver.findElement(By.name("password")).sendKeys("aviraj@123");
	}
}
