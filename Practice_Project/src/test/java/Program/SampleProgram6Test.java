package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class SampleProgram6Test {
	@Test
	public void sampleProgram6()
	{
		System.out.println("SampleProgram6 execution starts");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	    driver.findElement(By.xpath(" //textarea[@title='Search']")).sendKeys("books");
	    
		
		
		
		
		
		
	}

}
