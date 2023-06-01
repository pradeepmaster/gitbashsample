package stud.pra.practice;

import org.testng.annotations.Test;

public class Groupss 

{

	@Test(groups = "smoke")
	public void Add()
	{
	
		System.out.println("adding");
	}
	@Test(groups = "smoke")
	public void Bub()
	{
		System.out.println("subtract");
	}
	@Test(dependsOnMethods = "Bub")
	public void Culti()
	{
		System.out.println("multiplied");
	}
	@Test
	public void Division()
	{
		System.out.println("dividing");
	}
}
