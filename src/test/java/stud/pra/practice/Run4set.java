package stud.pra.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Run4set 
{

private static final Object[][][][] String = null;

@Test(dataProvider = "get")
public void create(String src,String dst,int a,String d)
{
	System.out.println("from-->"+src +" "+ "to-->" +dst+" "+"price="+a+" time"+" "+d);
}

@DataProvider()

public Object[][] get()
{
	Object [][]s = new Object[4][4];

	 s[0][0]="bengaluru";
	 s[0][1]="mysore";
	 s[0][2]=120;
	 s[0][3]="1hour";	 
	
	 s[1][0]="qspider";
	 s[1][1]="testyantra";
	 s[1][2]=220;
	 s[1][3]="2hour";
	 
	 s[2][0]="qspider";
	 s[2][1]="btm";
	 s[2][2]=320;
	 s[2][3]="3hour";
	 
	 s[3][0]="qspider";
	 s[3][1]="basavanagudi";
	 s[3][2]=320;
	 s[3][3]="3hour";
	
	 return s;
}
}
