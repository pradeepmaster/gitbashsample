package stud.pra.practice;

import java.io.FileInputStream;

//hi am pradeep s
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Constants;
public class Dataproviderexcel 
{
	@Test(dataProvider = "go")
	public void get(String src,String dst,String price)
	{
		System.out.println(src+""+dst+""+price);
	}
	@DataProvider
	public Object[][] go() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fi=new FileInputStream("");
		Workbook bo=WorkbookFactory.create(fi);
		Sheet sh = bo.getSheet("Sheet1");
		int la=sh.getLastRowNum()+1;
		int ce = sh.getRow(0).getLastCellNum();
	
		Object[][]arr=new Object[la][ce];
		for(int i=0;i<la;i++)
		{
			for(int j=0;j<ce;j++)
			{
		arr[i][j] =sh.getRow(i).getCell(j).toString();
			}
		}
	return arr;
	}
//	@DataProvider()
//	public void ms()
//	{
//
//	
//	}
	
	
	
	
	
}
