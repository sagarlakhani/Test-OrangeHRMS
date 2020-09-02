package com.orange.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.orange.base.Testbase;

public class ExcelOperation extends Testbase{

	public void ReadExcel() throws IOException {

		FileInputStream filepath = new FileInputStream(new File(prop.getProperty("Filelocation")));
		XSSFWorkbook workbook = new XSSFWorkbook(filepath);
		XSSFSheet sheet = workbook.getSheet("demo");

		FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

		for (Row row : sheet) // iteration over row using for each loop
		{
			for (Cell cell : row) // iteration over cell using for each loop
			{
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
