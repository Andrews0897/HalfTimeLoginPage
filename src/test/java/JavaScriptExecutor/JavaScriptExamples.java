package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExamples extends BaseClass{


	public static void main(String[] args) throws IOException {
		BaseClass bs = new BaseClass();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://wsf-uat.engage2serve.com/#/login");
		driver.manage().window().maximize();
		
		//Drawing Border & Take Screenshot
		WebElement logoBorder = driver.findElement(By.xpath("(//div[@ng-if='!orgConfigs.staffLogo']//img)[2]"));
		bs.drawBorder(logoBorder, driver);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".//ScreenShot//logo.png");
		FileUtils.copyFile(screenshot, target);
		
		driver.quit();
		
	}

}
