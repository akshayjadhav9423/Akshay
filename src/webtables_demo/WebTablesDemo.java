package webtables_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("", "");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		driver.findElement(By.xpath("")).getText();
		
		List<WebElement>rowCount= driver.findElements(By.xpath("//tables[@id='1234']/tbody/tr[1]"));

		List<WebElement> colCount=driver.findElements(By.xpath("//tables[@id='1234']/tbody/tr[1]/td"));
		
		
		
		
	}

}
