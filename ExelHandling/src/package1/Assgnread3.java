package package1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assgnread3 {
	public void readcell(int r, int c, Sheet ws) {
		int lenrow= ws.getRows();
		 int lencol= ws.getColumns();
		 System.out.println(lenrow + "and" + lencol);
		 if (r>0 && r<lenrow && c>0 && c<lencol) {
			 Cell c1= ws.getCell(c-1,r-1); 
			 System.out.println(c1.getContents());
		 }
		 else {
			 
			 System.out.println("please enter right no.");
		 }
	}
	public static void main(String[] args) throws BiffException, IOException {
		 File f= new File("E:\\selenium\\file1.xls");
		 Workbook wb=Workbook.getWorkbook(f);
		 Sheet ws=wb.getSheet(0);
		 Scanner inp1= new Scanner(System.in);
		 System.out.println("Enter row number");
		 int r= inp1.nextInt();
		 System.out.println("Enter col number");
		 int c=  inp1.nextInt();
		 Assgnread3 ref1= new Assgnread3();
		 ref1.readcell(r, c, ws);
		 wb.close();
	}
}
