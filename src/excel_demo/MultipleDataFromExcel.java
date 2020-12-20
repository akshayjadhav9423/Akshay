package excel_demo;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDataFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileInputStream fis=new FileInputStream("");
		Sheet sh=WorkbookFactory.create().getSheet();
		
		Row rowCount=sh.getLastRowNum();
		for(int i=0;i<=rowCount) {
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}

	}

}
