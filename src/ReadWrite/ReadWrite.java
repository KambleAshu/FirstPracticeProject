package ReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {
	
	public static void main (String[]args) throws IOException {
		File path  = new File("C:\\Users\\vikram\\Desktop\\New folder (2)\\MyBlessings007.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook accessworkbook	= 	new XSSFWorkbook(load);
	XSSFSheet  sheetno 	= accessworkbook.getSheetAt(0);
	String raed = sheetno.getRow(0).getCell(1).getStringCellValue();
	System.out.println(raed);
	
	
	
	FileOutputStream write11 = new FileOutputStream(path);
	sheetno.createRow(0).createCell(0).setCellValue("MOM AND DAD ARE MY WORLD");
	accessworkbook.write(write11);
	
	
	
	}
	
	
	
	

}
