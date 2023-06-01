package stud.pra.practice;

import org.testng.annotations.Test;

public class Test5set 
{
	@Test(dataProvider = "go",dataProviderClass = Run5set.class)
	public void run(String src,String dst,int a,String b,String c)
	{
		System.out.println("from-->"+src +" "+ "to-->" +dst+" "+"price="+a+" time"+" "+b+" "+"vehicle"+" "+c);
	}
}
