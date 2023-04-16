package googleTest;

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

public class simpleGoogleTest {

	@Test
	public void validateBing() throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement input= driver.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Public\\ECLIPSE\\I1_GitHubTest\\Screenshot/google.png"));
		driver.quit();	
	
	
	
	
	
}}
