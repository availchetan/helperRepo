package com.mycompany.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;



public class MyUtility extends BasicTC1Test {
	
	public static Logger log =Logger.getLogger(base.class.getName());
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("Initiated MyUtility application");
		log.info("At Before Test Method of utility");
		//super.basePageNavigation();
		super.checkLogin();
		
	}

	@Test(priority=1)
	public void getTextboxes() throws IOException {
		

		System.out.println(driver.getCurrentUrl());
		String pageTitle=driver.getTitle();
		System.out.println("Page Title of current Page: "+pageTitle);
		List <WebElement> tb=driver.findElements(By.xpath("//*[@type='text']"));
		 System.out.println("Total text boxes in the page="+tb.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\inputText.txt");

		 if(tb.size()>0) {
		 for(WebElement link : tb) {   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Text Box ID "+s+ " Text Box Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');}
	            
	
		 }
				 fout2.close();

           }
	
	@Test
	public void getButtons() throws IOException {
			
		List <WebElement> tb2=driver.findElements(By.xpath("//*[@type='submit']"));
		
		 System.out.println("Total buttons in the page="+tb2.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\submitButton.txt");

		if(tb2.size()>0) {
		 for(WebElement link : tb2) {
	   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Submit Button ID "+s+ " Submit Button Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');}
	             
	
		 }
				 fout2.close();

           }
		
	@Test
	public void getLinks() throws IOException, InterruptedException {
			
		List <WebElement> l=driver.findElements(By.tagName("a"));
		
		 System.out.println("Total Links in the page="+l.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\Links.txt");
		
		if(l.size()>0) {
		 for(WebElement link : l) {
	   
	             String s=link.getAttribute("target");	          
	             String s2=link.getAttribute("href");	            
	             String s3= " Link Target: "+s+ " Link reference: "+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');                     
	           
		 }
				 fout2.close();
				

           }

		}
	
	@AfterMethod
	public void navigateHome() {
		
		System.out.println("My Utility application after method... continue Finding Elements");
		
	}
	
	@Test
	public void getDropDowns() throws IOException {
			
		List <WebElement> dd=driver.findElements(By.tagName("select"));
		
		 System.out.println("Total Drop Downs in the page="+dd.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\dropdowns.txt");

		if(dd.size()>0) {
		 for(WebElement link : dd) {
	   
	             
	             String s=link.getAttribute("multiple required");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Drop Down Multiple select "+s+ " Drop Down Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');
	         	
		 }}
				 fout2.close();

           }
	
	
	@Test
	public void getRadioButtons() throws IOException {
			
		List <WebElement> tb2=driver.findElements(By.xpath("//*[@type='radio']"));
		
		 System.out.println("Total Radio buttons in the page="+tb2.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\radioButtons.txt");

		if(tb2.size()>0) {
		 for(WebElement link : tb2) {
	   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Radio Button ID "+s+ " Radio Button Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');
	            	
		 }}
				 fout2.close();

           }
	
	@Test
	public void getCheckBoxes() throws IOException {
			
		List <WebElement> tb2=driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		 System.out.println("Total Checkbox in the page="+tb2.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\checkboxes.txt");

		if(tb2.size()>0) {
		 for(WebElement link : tb2) {
	   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Checkbox ID "+s+ " Checkbox Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');
	             
	
		 }}
				 fout2.close();

           }
	
	@Test
	public void getFrames() throws IOException {
			
		List <WebElement> tb2=driver.findElements(By.tagName("frameset"));
		
		 System.out.println("Total Frames in the page="+tb2.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\frames.txt");

		if(tb2.size()>0) {
		 for(WebElement link : tb2) {
	   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Frameset ID "+s+ " Frameset Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');
	            
	
		 }}
				 fout2.close();

           }
	
	@Test
	public void getTables() throws IOException {
			
		List <WebElement> tb2=driver.findElements(By.tagName("table"));
		
		 System.out.println("Total Checkbox in the page="+tb2.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\tables.txt");

		if(tb2.size()>0) {
		 for(WebElement link : tb2) {
	   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Table ID "+s+ " Table Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');
	            
	
		 }}
				 fout2.close();

           }
	
	@Test
	public void getImages() throws IOException {
			
		List <WebElement> tb2=driver.findElements(By.tagName("img"));
		
		 System.out.println("Total Images in the page="+tb2.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\images.txt");

		if(tb2.size()>0) {
		 for(WebElement link : tb2) {
	   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Image ID "+s+ " Image Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');
	            
	
		 }}
				 fout2.close();

           }
	
	@Test
	public void getForms() throws IOException {
			
		List <WebElement> tb2=driver.findElements(By.tagName("form"));
		
		 System.out.println("Total Forms in the page="+tb2.size());
		 FileOutputStream fout2=new FileOutputStream("C:\\Users\\chetan\\Desktop\\KeepWithU\\temp\\forms.txt");

		if(tb2.size()>0) {
		 for(WebElement link : tb2) {
	   
	             
	             String s=link.getAttribute("id");
	             if(s==null)System.out.println("Id not found for element");
	             String s2=link.getAttribute("name");
	             if(s2==null)System.out.println("Name not found for element");
	             String s3= " Form ID "+s+ " Form Name"+s2;
	             byte b[]=s3.getBytes();//converting string into byte array    
	             fout2.write(b);   
	             fout2.write('\n');
	            
	
		 }}
				 fout2.close();

           }
	
	
	@AfterTest
	public void closeBrowser() throws Exception {
		
		System.out.println("Close ur browser only as we are running parallely");
		//super.closeWindow();
	}
	
	

	}