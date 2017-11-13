
package Proyecto;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportExcel {
    
	public void writeXLSXFile(DefaultTableModel modelo) throws IOException {
		
		String excelFileName = "Mayor.xlsx";//name of excel file                
		String sheetName = "Mayor";//name of sheet

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName) ;

                DefaultTableModel tabla = modelo;
		//iterating r number of rows
		for (int r=0;r < tabla.getRowCount(); r++ )
		{
			XSSFRow row = sheet.createRow(r);


			for (int c=0;c < tabla.getColumnCount(); c++ )
			{
				XSSFCell cell = row.createCell(c);
	
				cell.setCellValue(String.valueOf(tabla.getValueAt(r, c)));
			}
		}

            //write this workbook to an Outputstream.
            try (FileOutputStream fileOut = new FileOutputStream(excelFileName)) {
                wb.write(fileOut);
                fileOut.flush();
            }
	}

    
}
