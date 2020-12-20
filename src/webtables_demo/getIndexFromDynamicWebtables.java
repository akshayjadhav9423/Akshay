package webtables_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class getIndexFromDynamicWebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("", "");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='1234']/tr"));
		
		for(int i=2;i<=row.size();i++) {
			List<WebElement> cell=driver.findElements(By.xpath("//table[@id='1234']/tr["+i+"]/td"));
			for(int j=1;j<=cell.size();j++) {
				String act = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				
				
			}
		}

	}

}
