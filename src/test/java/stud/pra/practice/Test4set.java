package stud.pra.practice;

import org.testng.annotations.Test;

public class Test4set 

{

	@Test(dataProvider = "get",dataProviderClass = Run4set.class)
	public void create(String src,String dst,int a,String d)
	{
		System.out.println("from-->"+src +" "+ "to-->" +dst+" "+"price="+a+" time"+" "+d);
	}
}
