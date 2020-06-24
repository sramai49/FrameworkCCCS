package com.clearcode.po;

import org.openqa.selenium.By;

public class RealEstatePage {
	
//	public static By RealEstate_Lnk =By.linkText("Real Estate");
//	public static By ContactUs_Lnk =By.linkText("Contact Us");
//	public static By Reality=By.xpath("//div[@class='icon-container']");
	
	public static By your_name=By.name("name");
	public static By email_address=By.name("email");
	public static By subject=By.name("subject");
	public static By message=By.name("id:comments");
	public static By send_btn=By.xpath("//input[@type='submit']");
	public static By error_msg=By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']");
	
	
	
}
