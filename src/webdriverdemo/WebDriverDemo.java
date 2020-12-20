package webdriverdemo;

import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "e://selenium//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Point p=new Point(100,200);
		
		driver.manage().window().setPosition(p);
		
		Dimension d=new Dimension(100,200);
		
		driver.manage().window().setSize(d);
		
		String str=driver.getTitle();
		
		String str2=driver.getCurrentUrl();
		
		driver.navigate().to("https://www.youtube.com");
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();

	}

}
