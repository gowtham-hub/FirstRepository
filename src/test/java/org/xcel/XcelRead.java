package org.xcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Gowtham\\eclipse-workspace\\Mavens\\ExcelFiles\\xcel.xlsx");

FileInputStream fi=new FileInputStream(f);

Workbook w=new XSSFWorkbook(fi);
Sheet s=w.getSheet("mark");

for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
	Row r=s.getRow(i);
	
	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
		
		Cell c=r.getCell(j);
		System.out.print(c+"    ");
	}
	System.out.println();
	
}


	}

}
