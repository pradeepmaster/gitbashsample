package stud.pra.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Run5set 
{
	@Test(dataProvider = "go")
	public void run(String src,String dst,int a,String b,String c)
	{
		System.out.println("from-->"+src +" "+ "to-->" +dst+" "+"price="+a+" time"+" "+b+" "+"vehicle"+" "+c);
	}
	
	
@DataProvider
 public Object[][] go()
 {
	Object [][]s = new Object[5][5];

	 s[0][0]="bengaluru";
	 s[0][1]="mysore";
	 s[0][2]=120;
	 s[0][3]="1hour";	 
	 s[0][4]="car";
	
	 s[1][0]="qspider";
	 s[1][1]="testyantra";
	 s[1][2]=220;
	 s[1][3]="2hour";
	 s[1][4]="bus";
	 
	 s[2][0]="qspider";
	 s[2][1]="btm";
	 s[2][2]=320;
	 s[2][3]="3hour";
	 s[2][4]="train";
	 
	 s[3][0]="qspider";
	 s[3][1]="basavanagudi";
	 s[3][2]=320;
	 s[3][3]="3hour";
	 s[3][4]="cycle";
	
	 s[4][0]="qspider";
	 s[4][1]="basavanagudi";
	 s[4][2]=320;
	 s[4][3]="4hour";
	 s[4][4]="bike";
	 
	 return s;
 }

}
