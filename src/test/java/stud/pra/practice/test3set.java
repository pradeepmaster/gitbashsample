package stud.pra.practice;

import org.testng.annotations.Test;

public class test3set 
{
	@Test(dataProviderClass = Run3set.class,dataProvider = "get")
	public void create(String src,String dst,int price)
	{
		System.out.println("from-->"+src +" "+ "to-->" +dst+ " --->price"+" "+price );
	}
}
