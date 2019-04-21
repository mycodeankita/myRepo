package package1;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteExcel {
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File f=new File("E:\\selenium\\file1.xls"); // establish connection
		WritableWorkbook wwb= Workbook.createWorkbook(f); 
		WritableSheet ws= wwb.createSheet("Ankita", 0);
		for (int i=1;i<3;i++)	{
			for(int j=0;j<4;j++) {
				Label l= new Label(j, i, "My Content");
				ws.addCell(l);
				
			}
		}
		wwb.write();
		wwb.close();
	}
}
