package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void write_Data() throws IOException {
		
		File f = new File("C:\\Users\\SyedAli\\eclipse-workspace\\Maven_Project\\User Data.xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook w  = new XSSFWorkbook(fis);
		
		Sheet createSheet = w.createSheet("User Info");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Ali");
		
		w.getSheet("User Info").getRow(0).createCell(1).setCellValue("123");
		
		w.getSheet("User Info").createRow(1).createCell(0).setCellValue("Mugazir");
		
		w.getSheet("User Info").getRow(1).createCell(1).setCellValue("456");
		
		w.getSheet("User Info").createRow(2).createCell(0).setCellValue("Riyaz");
		
		w.getSheet("User Info").getRow(2).createCell(1).setCellValue("789");
		
		w.getSheet("User Info").createRow(3).createCell(0).setCellValue("Bilal");
		
		w.getSheet("User Info").getRow(3).createCell(1).setCellValue("198");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		write_Data();
		
	}

}
