package utilities;

import java.util.Date;
import java.util.Random;

public class Javautilities 

{
public int getRandomNum()
{
	Random r =new Random();
	int rand=r.nextInt();
return rand;
}

public String currentSysDate()
{
	Date d=new Date();
	String dd = d.toString();
	return dd;
}

public String sysDateFormat()
{
	Date d1=new Date();
	String dd1=d1.toString();
	String[] ar = dd1.split(" ");
	int month =d1.getMonth();

	String week=ar[0];
	String date=ar[2];
	String year=ar[5];
	
String dateform=month+week+date+year;
return dateform;	
	
}

}
