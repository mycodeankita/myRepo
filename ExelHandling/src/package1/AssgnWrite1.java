package package1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class AssgnWrite1 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File f = new File("E:\\selenium\\file1.xls");
		WritableWorkbook wwb= Workbook.createWorkbook(f);
		WritableSheet ws= wwb.createSheet("Assgn1", 2);
		Scanner inp1= new Scanner(System.in);
		String s;
		System.out.println("Enter nine inputs");
		for (int i=0;i<3;i++)	{
			for(int j=0;j<3;j++) {
				
			s=inp1.nextLine();
				Label l= new Label(j, i, s);
				ws.addCell(l);
				
			}
		
	}
		wwb.write();
		wwb.close();
}
}
