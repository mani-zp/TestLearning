package PeopleLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPeople {

	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
		ChromeDriver driver = new CookieHandler().Login();
//		driver.manage().window().maximize();
//		driver.get("https://www.people.zoho.com/");
//		
//		//Navigate and Enter Login credentials
//			//Navigate to login page
//		WebElement login = driver.findElement(By.className("zgh-login"));
//		login.click();
//		
//		//Enter user-name and password
//		WebElement username=driver.findElement(By.id("login_id"));
//		username.sendKeys("manikandan.parasuraman+icc@zohotest.com");
//		driver.findElement(By.id("nextbtn")).click();
//		//Password
//		WebElement password=driver.findElement(By.id("password"));
//		password.sendKeys("mani@1234");
		//Skip Authenticator
		
//		Thread.sleep(2000);
//		//click service
//		driver.findElement(By.id("nextbtn")).click();
	
		Thread.sleep(2000);
		
		//Select form
		driver.findElement(By.id("zp_maintab_services")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/div[2]/div[22]/span")).click();
		
		Thread.sleep(2000);
		
		//Select the particular form
		driver.findElement(By.xpath("//*[@id=\"zp_t_api_form_form_listview-formId_696917000002283001_viewId_696917000002283003\"]")).click();
		Thread.sleep(2000);
		
		//Add record
		WebElement Addrecord = driver.findElement(By.id("zp_record_add_btn"));
		Addrecord.click();
		
		//Select Dropdown-1 by value 
		WebElement Dp1 = driver.findElement(By.id("zp_field_outer_696917000002283243"));
		Select selectdp1 = new Select(Dp1);
		selectdp1.selectByValue("00");
		
		
		//Select Dropdown-2 by value 
		WebElement Dp2 = driver.findElement(By.id("s2id_zp_field_696917000002283275"));
		Select selectdp2 = new Select(Dp2);
		selectdp2.selectByValue("val 3");
		
		//Submit record
		WebElement Submitrec = driver.findElement(By.id("zp_forms_add_btn"));
		Submitrec.click();
		
		
		
		driver.close();
	}

}
