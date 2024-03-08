package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShots {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://hti-uat.engage2serve.com");
		driver.manage().window().maximize();

		
		//Full Page ScreenShot
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File file = new
		 * File(".//ScreenShot//loginPage.png"); FileUtils.copyFile(src, file);
		 */

		// ScreenShot of section/portion of the page
		
		/*
		 * WebElement screen = driver.findElement(By.
		 * xpath("//div[@class='col-sm-5 common-login-content-area-wrapper']//div[1]"));
		 * File src = screen.getScreenshotAs(OutputType.FILE); File file = new
		 * File(".//ScreenShot//Logo.png"); FileUtils.copyFile(src, file);
		 */
		
		
		// ScreenShot of webelement of the page
		
				WebElement screen = driver.findElement(By.xpath("//div[@class='col-sm-5 common-login-content-area-wrapper']//div[1]"));
				File src = screen.getScreenshotAs(OutputType.FILE);
				File file = new File(".//ScreenShot//Logo.png");
				FileUtils.copyFile(src, file);
		
		driver.quit();
	}

}
