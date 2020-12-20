package autosuggetion_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","e://selenium//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		String exp="redmi 9";
		for(WebElement ele:options) {
			String act=ele.getText();
			if(act.equalsIgnoreCase(exp)) {
				ele.click();
				break;
			}
		}
		

	}

}
