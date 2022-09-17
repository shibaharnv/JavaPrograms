/*package javaallpgmspackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashmapGoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//nshibaha//Desktop//WORK//AUTOMATION//geckodriver-v0.18.0-win64/geckodriver.exe");
		
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nshibaha\\Desktop\\WORK\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		  
		  ChromeDriver driver = new ChromeDriver();
		  

		
		driver.get("https://www.google.co.in/");
		
		HashMap<String ,String> firsthashmapboj = new HashMap<String,String>();
		HashMap<String ,String> Secondhashmapboj = new HashMap<String,String>();
		
		firsthashmapboj.put("1", driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).getText());
		firsthashmapboj.put("2", driver.findElement(By.xpath("//a[contains(text(),'Images')]")).getText());
		Secondhashmapboj.put("1", driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).getText());
		Secondhashmapboj.put("2", driver.findElement(By.xpath("//a[contains(text(),'Images')]")).getText());
		
		System.out.println(firsthashmapboj.keySet());
		
	for(String Key : firsthashmapboj.keySet())
		
		
	{
		System.out.println(firsthashmapboj.get(Key));
		
		
	Assert.assertTrue(firsthashmapboj.get(Key).trim().equalsIgnoreCase(Secondhashmapboj.get(Key).trim()));
		
		System.out.println("Value are matching");
	}
		
		
		
		if(firsthashmapboj.equals(Secondhashmapboj))
		{
			System.out.println("Passed");
		}
		
		System.out.println(hashmapboj.entrySet());
		
		Collection<String> Value = hashmapboj.values();
		
		
		Set<String> Key= hashmapboj.keySet();
		
		for(String key :hashmapboj.get(key) )
		{
			System.out.println(hashmapboj.get(key));
		}
			
			System.out.println();
		
		
		if(Value.equals(Key))
			
		{
			System.out.println("Texts are matching");
		}
	
		
		driver.close();
	}

}
*/