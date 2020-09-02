package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelreadTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(new File(
				"D:\\Learn automation\\OrangeHRMS\\Test-OrangeHRMS\\src\\main\\java\\com\\orange\\testdata\\user.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("demo");
		Iterator<Row> itr = sheet.iterator();

		FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

		while (itr.hasNext()) {
			Row row = itr.next();

			Iterator<Cell> cellIterator = row.iterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (evaluator.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC: // field that represents numeric cell type
					// getting the value of the cell as a number
					System.out.print(cell.getNumericCellValue() + "\t\t");
					break;
				case Cell.CELL_TYPE_STRING: // field that represents string cell type
					// getting the value of the cell as a string
					System.out.print(cell.getStringCellValue() + "\t\t");
					break;
				}
			}

			System.out.println();

		}

	}
}
