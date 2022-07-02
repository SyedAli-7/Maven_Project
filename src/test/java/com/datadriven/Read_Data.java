package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void read_All_Data() throws IOException {
		
		System.out.println("** All Data **");
		
		File f = new File("C:\\Users\\SyedAli\\eclipse-workspace\\Maven_Project\\User Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		//Interface			Class	
		Workbook w = new XSSFWorkbook(fis);   //Upcasting
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
		Row row = sheetAt.getRow(i);
		
		int numberOfCells = row.getPhysicalNumberOfCells();
		
		for (int j = 0; j < numberOfCells; j++) {
			
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(cellType.STRING)) {
				
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			} else if (cellType.equals(cellType.NUMERIC)) {
				
				double value = cell.getNumericCellValue();
				int num = (int) value; //Narrowing type casting
				System.out.println(num);
				
			}
			
		}
			
		}
		
		}
	
	public static void read_Particular_Data() throws IOException {
		
		System.out.println("** Particular Data **");
		
		File f = new File("C:\\Users\\SyedAli\\eclipse-workspace\\Maven_Project\\User Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		} else if (cellType.equals(cellType.NUMERIC)) {
			
			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
			
		}

	}
	
	public static void main(String[] args) throws IOException {
		
		read_All_Data();
		read_Particular_Data();
		
	}
		
	}
