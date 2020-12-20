package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("", "");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("");
		
		FileHandler.copy(src, dest);

	}

}
