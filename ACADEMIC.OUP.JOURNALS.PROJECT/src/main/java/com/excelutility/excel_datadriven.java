package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class excel_datadriven 

{

	WebDriver driver;
	
	public String excel_username(int a) throws  IOException
	{
		//File f  = new File("exceldata.xlsx");
		//System.out.println(f.canRead()+""+f.exists());
	FileInputStream fil = new FileInputStream(new File("C:\\Users\\megha\\OneDrive\\Desktop\\exceldata.xlsx"));
    XSSFWorkbook workbook = new XSSFWorkbook(fil);
    XSSFSheet sheet= workbook.getSheet("Sheet1");
    int count = sheet.getLastRowNum();
    System.out.println(count);
    
    XSSFRow row= sheet.getRow(a);
    XSSFCell cell= row.getCell(0);
    String un =cell.getStringCellValue();
    System.out.println(un);
    return un;
    
    }
	public String excel_password(int b) throws  IOException
	{
	FileInputStream fil = new FileInputStream(new File("C:\\Users\\megha\\OneDrive\\Desktop\\exceldata.xlsx"));
    XSSFWorkbook workbook = new XSSFWorkbook(fil);
	XSSFSheet sheet= workbook.getSheet("Sheet1");
    int count = sheet.getLastRowNum();
    System.out.println(count);
    
    XSSFRow row= sheet.getRow(b);
    XSSFCell cell= row.getCell(1);
    String pwd =cell.getStringCellValue();
    System.out.println(pwd);
    return pwd;
	}
}
