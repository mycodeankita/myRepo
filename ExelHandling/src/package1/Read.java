package package1;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Read {

public static void main(String[] args) throws BiffException, IOException {
	File f=new File("E:\\selenium\\excel1.xls"); // establish connection
	Workbook wk= Workbook.getWorkbook(f); //workbook object
	Sheet ws= wk.getSheet(0); //sheet object
	int r= ws.getRows();
	int c= ws.getColumns();
	for (int i=0;i<r;i++)	{
		for(int j=0;j<c;j++) {
			Cell c1= ws.getCell(j,i);
			System.out.println(c1.getContents());
		}
	}
}
}
