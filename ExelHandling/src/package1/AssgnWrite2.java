
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

public class AssgnWrite2 {
	public void DataWrite1(int r, int c, WritableSheet ws) throws RowsExceededException, WriteException
	{
		Scanner inp2= new Scanner(System.in);
		String s;
		for (int i=0;i<r;i++)	{
			for(int j=0;j<c;j++) {
				
			s=inp2.nextLine();
				Label l= new Label(j, i, s);
				ws.addCell(l);
				
			}
		
	}
	}
	
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File f = new File("E:\\selenium\\file1.xls");
		WritableWorkbook wwb= Workbook.createWorkbook(f);
		WritableSheet ws= wwb.createSheet("Assgn1", 2);
		
		Scanner inp1= new Scanner(System.in);
		System.out.println("Enter row count");
		int r= inp1.nextInt();
		System.out.println("Enter column count");
		int c= inp1.nextInt();
		AssgnWrite2 ref1=new AssgnWrite2();
		ref1.DataWrite1(r,c,ws);
		
		
		wwb.write();
		wwb.close();
}
}