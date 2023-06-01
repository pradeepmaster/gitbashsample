package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Pradeep Babu
 *
 */
public class webdriverutilities {
	/**
	 * This method is used to maximize the browser
	 * 
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void minimize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method wil help to wait until element is visible
	 * 
	 * @param driver
	 * @param ele
	 * @param duration
	 */
	public void Wait(WebDriver driver, WebElement ele, Duration duration) {
		WebDriverWait w = new WebDriverWait(driver, duration);
		w.until(ExpectedConditions.visibilityOf(ele));
	}

	public void Elementclickable(WebDriver driver, WebElement ele, Duration duration) {
		WebDriverWait wa = new WebDriverWait(driver, duration);
		wa.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void switchingwindow(WebDriver driver, String text) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String id = it.next();
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();

			if (url.contains(text)) {
				break;
			}
		}
	}

/**
 * this  method will switch to window if title is same
 * @param driver
 * @param title
 */
public void switc(WebDriver driver,String title)
{
	Set<String> set1 = driver.getWindowHandles();
	
	for(String id:set1)
	{
		driver.switchTo().window(id);
	String text1=	driver.getTitle();
	     if(text1.contains("title"))
	    {
		break;
	    }
	}
}

public String screen(WebDriver driver,String scr) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
   File src= ts.getScreenshotAs(OutputType.FILE);
   LocalDateTime ldttime=LocalDateTime.now();
   String text=ldttime.toString().replace(" ", "_").replace(".", "_");
    File dst=new File("./hik/"+text+ " " +scr+".png");
	FileUtils.copyFile(src, dst);
	return scr;
	
}
public  void customwait(int duration,WebElement ele,long polltime)
{
	int count=0;
	while(count<duration)
	{
		try
		{
			ele.click();
			break;
		}
		catch(Exception e)
		{
			try
			{
				Thread.sleep(polltime);
			}catch(Exception s)
			{
				s.printStackTrace();
			}
			count++;
		}
	}
}
public void switchtoalertpopupanddismiss(WebDriver driver, String text)
{
	Alert al=driver.switchTo().alert();
	
	if(al.getText().trim().equalsIgnoreCase(text.trim()))
{
	System.out.println("alert is present");
}
	else
	{
		System.out.println("alert is not present");
	}
	al.dismiss();
}
/**
 * this method is used to accept the alert pop up
 * @param driver
 * @param text
 */
public void switchtoalertpopupandaccept(WebDriver driver, String text)
{
	Alert al=driver.switchTo().alert();
	
	if(al.getText().trim().contains(text.trim()))
{
	System.out.println("alert is present");
}
	else
	{
		System.out.println("alert is not present");
	}
	al.accept();
}

/**
 * 
 */

public void switchtoframe(WebDriver driver ,String id)
{
	driver.switchTo().frame(id);
	
}

public void switchtoframe(WebDriver driver ,int index)
{
	driver.switchTo().frame(index);
	
}

public void switchtoframe(WebDriver driver ,WebElement ele)
{
	driver.switchTo().frame(ele);
}

public void switchtoframe(WebDriver driver)
{
	driver.switchTo().defaultContent();
}


/**
 * 
 */
public void rightclick(WebDriver driver,WebElement ele)
{
	Actions ac=new Actions(driver);
	ac.contextClick(ele).perform();
}

public void doubleclick(WebDriver driver,WebElement ele)
{
	Actions act=new Actions(driver);
	act.doubleClick(ele).perform();
}


public void mouseoveronelement(WebDriver driver ,WebElement ele)
{
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
}

/**
 * 
 */


public void getalloptionsfromdropdown(WebElement ele)
{
	Select sel=new Select(ele);
	List<WebElement> all = sel.getOptions();
	for(WebElement a:all)
	{
	String text=	a.getText();
	System.out.println("text");
	}
}
public void selectelementindropdown(String text,WebElement ele)
{
	Select sel=new Select(ele);
	sel.selectByVisibleText(text);
}
public void selectelementindropdown(int index,WebElement ele)
{
	Select sel=new Select(ele);
	sel.selectByIndex(index);
}
public void selectelementindropdown(WebElement ele,String data)
{
	Select sel=new Select(ele);
	sel.selectByValue(data);
}

public void ignorenosuchelementexception(WebDriver driver)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.explicitduration));
wait.ignoring(NoSuchElementException.class);
}
public void waitforurl(WebDriver driver ,String url)

{
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.explicitduration));	
wait.until(ExpectedConditions.urlContains(url));
}
public void waitfortitle(WebDriver driver ,String title)

{
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.explicitduration));	
wait.until(ExpectedConditions.titleContains(title));
}

public void waitforalertpopup(WebDriver driver)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.explicitduration));
}

public void waittillpagegetsloaded(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.explicitduration));
}

public void fileupload(WebDriver dr,String path,WebElement ele)
{
//	File f = new File(path);
//	String path1=f.getAbsolutePath();
//	dr.findElement(By.xpath("ele")).sendKeys(path1);
}



}