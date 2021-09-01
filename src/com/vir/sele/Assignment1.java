package com.vir.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Downloads\\Assignment1\\chromedriver.exe");
                  WebDriver Driver= new ChromeDriver();
                  Driver.get("https://opensource-demo.orangehrmlive.com/");
                  String Title=Driver.getTitle();
                  System.out.println(Title);
                  //** Entering Username by CSS Selector
                Driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
                 //**Entering password by using xpath
                  Driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
                  //**clicking login
                  Driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
                  
                  
                  //** Xpath and css selectorss
                 //** Xpath- //tagname[@attributename="value"];
                  
                  //**Xpath for username:-//*[@id="txtUsername"];
                  //**css selector:-#txtUsername
                  
                  //**css for pass word :-#frmLogin
                  //**xpath for password:-//*[@id="txtPassword"];
                  
                  //**xpath for login:-//*[@id="btnLogin"];
                  //** css for login:-#btnLogin;
                  
                  //**xpath for images:-//*[@id="divLogo"]/img
                  //**css for image:-#divLogo > img
                  
                  //**Xpath for forget password:-//*[@id="forgotPasswordLink"]/a
                  //**css for forget password:-#forgotPasswordLink > a
                  
              
          boolean isvalidated =   Driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).isEnabled();
          if (isvalidated) {
			System.out.println("validated");
		} 
          else {

        		System.out.println("is not validated");
          
          } 
        	  
          
           
                  
                  
                  
                  
                  
                  
                  
                  
		
		
		

	}

}
