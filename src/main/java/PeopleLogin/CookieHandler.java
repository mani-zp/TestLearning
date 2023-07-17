package PeopleLogin;


import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandler {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		new CookieHandler().Login();
		
	}
	
	public ChromeDriver Login() throws Exception
	{
		Properties prop = new Properties();
		FileReader CookieReader = new FileReader("/Users/mani-14604/Documents/Automation Workspace/TestLMS/cookie.properties");
		FileReader ConfigReader = new FileReader("/Users/mani-14604/Documents/Automation Workspace/TestLMS/config.properties");
		
       
		prop.load(CookieReader);
        prop.load(ConfigReader);
       
		
		
		ChromeDriver driver = new ChromeDriver();
		
		String _iamadt = prop.getProperty("_iamadt");
		String _iambdt = prop.getProperty("_iambdt");
		String appserver = prop.getProperty("appserver");
		String PeopleServer = prop.getProperty("peopleServer");
		
	
		
		
//		file path - :: /Users/mani-14604/Documents/Automation Workspace/TestLMS/cookie.properties
		
		
		driver.get("https://accounts.zoho.com/");
		
		 Cookie iamadt = new Cookie("_iamadt", _iamadt,appserver,"/",null);
	     Cookie iambdt = new Cookie("_iambdt", _iambdt,appserver,"/",null);
	     
		driver.manage().addCookie(iamadt);
		driver.manage().addCookie(iambdt);
		    
		    
		 driver.get(PeopleServer);
		 
		 driver.manage().window().maximize();
		 
		return driver;
		 
//		 Thread.sleep(5000);
//		
//		driver.close();
		
	}
	}


