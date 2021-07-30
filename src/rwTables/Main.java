package rwTables;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
//		ExcelManipulator excel = new ExcelManipulator();
//		excel.rwXLSX();
		CSVManipulator csv = new CSVManipulator();
		csv.rwCSV();
	}

}
