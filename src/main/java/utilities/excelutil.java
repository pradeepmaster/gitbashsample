package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class excelutil implements Constants
/**
 * 
 */

{
public void excelwrite( String sheetname,int cellno,int rowno,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new  FileInputStream(excelpath);
    
	   Workbook bo = WorkbookFactory.create(fs);
	   
	  Sheet sh= bo.getSheet(sheetname);
	  
	 Row r= sh.createRow(rowno);
	Cell c= r.createCell(cellno) ;
	 c.setCellValue(data);
	  
	 
	  FileOutputStream fi=new FileOutputStream("./src\\\\test\\\\resources\\\\exc.xlsx");
	  bo.write(fi);
	  bo.close();
	  	  
}
public String excelfetch(int cellno,String sheetname,int rowno) throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new  FileInputStream("./src\\test\\resources\\exc.xlsx");
    
	   Workbook bo = WorkbookFactory.create(fs);
	   
	  Sheet sh= bo.getSheet(sheetname);
	  
	Row r=  sh.getRow(rowno);

Cell c=	r.getCell(cellno);

DataFormatter d=new DataFormatter();
String data=d.formatCellValue(c);
return data;

}
public void fetchdatafromexcel(String sheetname,int cellno) throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new  FileInputStream("./src\\test\\resources\\exc.xlsx");
    
	   Workbook bo = WorkbookFactory.create(fs);
	   
	  Sheet sh= bo.getSheet(sheetname);
	  int last=sh.getLastRowNum();
	  
	  for(int i=0;i<last;i++)
	  {
		 Cell c= sh.getRow(i).getCell(0);
		String url= c.getStringCellValue();
		System.out.println(url);
	  }
}
public void writedataintoexcel(WebDriver driver,String sheetname) throws EncryptedDocumentException, IOException
{
	List<WebElement> all = driver.findElements(By.xpath("//a"));
	
	
	
	FileInputStream fs=new  FileInputStream(excelpath);
    
	   Workbook bo = WorkbookFactory.create(fs);
	   
	  Sheet sh= bo.getSheet(sheetname);
	  
	
	for(int i=0;i<all.size();i++)
	{
Cell cc=sh.createRow(i).createCell(0);	
String ref=	all.get(i).getAttribute("href");	
    	cc.setCellValue(ref);
	}
	FileOutputStream fo=new FileOutputStream(Constants.excelpath);
	bo.write(fo);
}

}
