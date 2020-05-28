package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelreadTest {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\Learn automation\\OrangeHRMS\\Test-OrangeHRMS\\src\\main\\java\\com\\orange\\testdata\\user.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		System.out.println(sheets);
		
		for (int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equals("demo")) {
	//			XSSFsheet sheet = workbook.getSheetAt(i);
			}
		}

	}

}
