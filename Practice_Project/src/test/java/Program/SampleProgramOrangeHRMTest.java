package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleProgramOrangeHRMTest {
	@Test
	public void sampleProgram2()
	{
		System.out.println("SampleProgram2 execution start");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=null;
		String Browser=System.getProperty("browser");
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String URL=System.getProperty("url");
	    driver.get(URL);
		//driver.get("https://www.saucedemo.com/");
		
		String UserName=System.getProperty("username");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(UserName);
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		String PassWord=System.getProperty("password");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PassWord);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
