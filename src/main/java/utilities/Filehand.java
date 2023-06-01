package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filehand 

{
  public Properties addProperty( String key) throws IOException
  {
	  FileInputStream f=new FileInputStream("\\src\\test\\resources\\New Text Document (3).properties.bak");
	  Properties pf=new Properties();
	  pf.load(f);

	String  URL=	pf.getProperty("url");
		String PASSWORD=	pf.getProperty("password");
		String USERNAME=	pf.getProperty("username");
		String BROWSER=	pf.getProperty("browser");

		return pf;
  }
  
  
	
	
}
