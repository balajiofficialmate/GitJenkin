package bingTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class simpleBingTest {

	
	
	@Test
public void validateBing() throws IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bing.com/");
	WebElement input= driver.findElement(By.name("q"));
	input.sendKeys("Cchennai");
	input.submit();
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\Users\\Public\\ECLIPSE\\I1_GitHubTest\\Screenshot/bing.png"));
	driver.quit();
	
	
}
	
	
	
	
	
	
	
	
}
