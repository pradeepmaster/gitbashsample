package stud.pra.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Run3set 
{

	@Test(dataProvider = "get")
	public void create(String src,String dst,int price)
	{
		System.out.println("from-->"+src +" "+ "to-->" +dst+ " --->price"+" "+price );
	}
	@DataProvider()
	public Object[][] get()
	{
		Object [][]s = new Object[3][3];
		 s[0][0]="bengaluru";
		 s[0][1]="mysore";
		 s[0][2]=100;
		
		 s[1][0]="qspider";
		 s[1][1]="testyantra";
		 s[1][2]=200;
		 
		 s[2][0]="shiroor";
		 s[2][1]="kundapura";
		 s[2][2]=300;
		 return  s;
	}
}
