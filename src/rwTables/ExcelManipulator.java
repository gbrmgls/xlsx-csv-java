package rwTables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManipulator {
	
	public void rwXLSX () throws IOException {
		FileInputStream fileIn = new FileInputStream("src/tabela.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fileIn);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		for(int i = 0; i < sheet.getLastRowNum(); i++) {
			for(int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				System.out.print(sheet.getRow(i).getCell(j) + " | ");
			}
			System.out.println("");
		}
		
		Row row = sheet.createRow(sheet.getLastRowNum()+1);
		for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
			row.createCell(i).setCellValue("teste");
		}
		OutputStream fileOut = new FileOutputStream("src/tabela.xlsx");
		wb.write(fileOut);
		
		wb.close();
	}
}
