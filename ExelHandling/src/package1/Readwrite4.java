package package1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Readwrite4 {
public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
	File f= new File("E:\\selenium\\excel1.xls");
	 Workbook wb=Workbook.getWorkbook(f);
	 Sheet ws=wb.getSheet(0);
	 int r= ws.getRows();
	int c= ws.getColumns();
		File fw=new File("E:\\selenium\\file1.xls"); // establish connection
		WritableWorkbook wwb= Workbook.createWorkbook(fw); 
		WritableSheet ws1= wwb.createSheet("Ankita", 0);
		String s;
		
		for (int i=0;i<r;i++)	{
			for(int j=0;j<c;j++) {
				Cell c1= ws.getCell(j,i);
				s=c1.getContents();
				System.out.println(s);
				jxl.write.Label l= new jxl.write.Label(j, i, s);
				ws1.addCell(l);
			}
		}
			wwb.write();
			wwb.close();
			wb.close();
			}
}

