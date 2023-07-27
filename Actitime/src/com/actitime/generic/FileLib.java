package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//it contains all generic methods which is independent of projects
public class FileLib {
	
	
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");//filenotfoundexception
		Properties p=new Properties();
		p.load(fis);//ioexception
		
		String data = p.getProperty(key);
		return data;
	}
	
	
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./data/testscript.xlsx");
		 Workbook wb= WorkbookFactory.create(fis);
		 String data= wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();//getStringCellValue
		  return data;
		}
	
	
}
