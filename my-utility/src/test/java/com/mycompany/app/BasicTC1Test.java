package com.mycompany.app;
	
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class BasicTC1Test extends HomePageTest {
			
		public void checkLogin() throws Exception
		{
			super.basePageNavigation();
					
		LandingPage lp=new LandingPage(driver);
		WebElement we=lp.getLogin();
		we.click();
		Thread.sleep(3000L);
		LoginPage l= new LoginPage(driver);
		we=l.getEmail();
		HomePageTest hp=new HomePageTest();
		String Username=hp.usercred();
		we.sendKeys(Username);
		we=l.getSubmit();
		we.click();//driver.findElement from
		we= l.getPassword();
		String Password=hp.passcred();
		Thread.sleep(3000L);
		we.sendKeys(Password);
		WebElement we2=l.getSubmit2();
		we2.click();
		Thread.sleep(3000L);
		}
		
		public WebDriver getDriver() {
			// TODO Auto-generated method stub
			return this.driver;
		}
		
		public void closeWindow() throws Exception {
			
			 //HomePage hs= new  HomePage();
			 //hs.tearDown();
			this.driver.close();
		}
		
		public void testTakesScreenshot(WebDriver webDriver){
			Date d= new Date();			
			SimpleDateFormat sd=new SimpleDateFormat("S");			
			String s=sd.format(d);
			String fileString="c:\\tmp\\screenshot";
			String newFileString=fileString+s+".png";
		try {
			
		File scrFile =((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(newFileString));
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	}

