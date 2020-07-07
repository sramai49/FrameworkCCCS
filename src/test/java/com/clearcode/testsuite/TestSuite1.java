package com.clearcode.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;
import com.clearcode.po.RealEstatePage;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;
import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{

	//@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
	@Test(dataProvider="RealEstateLoginData",dataProviderClass=LoginData.class)
	public void CreateStudent(String Description,String E_Mail,String Password, String name,String email_id, String Subject, String Message) throws InterruptedException {  //CreateStudent
		//wdu.type(HomePage.username_ip, data[0]);
		//wdu.type(HomePage.pwd_ip, data[1]);
		//wdu.click(HomePage.login_btn);
		//wdu.mouseOver(MenuBar.patient_menu);
		//wdu.click(MenuBar.newPatient_menu);
		//wdu.selectByVisibleText(PatientPage.title_select, data[2]);
		//wdu.type(PatientPage.fname_ip, data[3]);
		//wdu.type(PatientPage.lname_ip, data[4]);
		

		wdu.type(RealEstatePage.your_name,name);
		wdu.type(RealEstatePage.email_address,email_id);
		wdu.type(RealEstatePage.subject,Subject);
		wdu.type(RealEstatePage.message,Message);
		wdu.click(RealEstatePage.send_btn);
		wdu.exist(RealEstatePage.error_msg);
		//wdu.assertText(RealEstatePage.error_msg,"One or more fields have an error. Please check and try again.");
		if(wdu.exist(RealEstatePage.error_msg)) {
			System.out.println("Pass");;
			
		}else
		{		
			System.out.println("Fail");
			
		}
		
		
		
		
	}


	
	//@Test(dataProvider="SearchPatient",dataProviderClass=LoginData.class)
	//public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
		//wdu.type(HomePage.username_ip, user);
		//wdu.type(HomePage.pwd_ip, pwd);
		//wdu.click(HomePage.login_btn);
		//wdu.mouseOver(MenuBar.patient_menu);
		//wdu.click(MenuBar.newPatient_menu);
		//wdu.selectByVisibleText(PatientPage.title_select, title);
		//wdu.type(PatientPage.fname_ip, fname);
		//wdu.type(PatientPage.lname_ip, lname);
	//}
	
}
