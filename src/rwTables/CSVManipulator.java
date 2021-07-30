package rwTables;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.*;

public class CSVManipulator {
	public void rwCSV () throws IOException {
		final String CSV_PATH = "src/tabela.csv";
		
		FileWriter fw = new FileWriter(new File(CSV_PATH));
		CSVWriter cw = new CSVWriter(fw);
		
		String[] headers = {"nome", "email", "telefone"};
		List<String[]> data = new ArrayList<String[]>();
		
		String[] item1 = {"Everton", "everton@gmail.com", "1234414"};
		String[] item2 = {"Maria", "maria@gmail.com", "14525234"};
		String[] item3 = {"Jose", "jose@gmail.com", "16664534"};
		
		data.add(headers);
		data.add(item1);
		data.add(item2);
		data.add(item3);
		
		cw.writeAll(data);
		
		cw.close();
		fw.close();
	}
}
