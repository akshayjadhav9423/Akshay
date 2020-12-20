package excel_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("", "");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		File file=new File("");
		
		Sheet sh=WorkbookFactory(file).getSheet();
		
		String st= sh.getRow().getCell().getStringCellValue();
		
		double d=sh.getRow(1).getCell().GetNumericCellValue();
		
		
		
		
		
		driver.close();
		

	}

}
