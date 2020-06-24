package com.clearcode.po;

import org.openqa.selenium.By;

public class HomePage {
	//public static By username_ip = By.id("authUse");
	//public static By pwd_ip = By.id("clearPass");
	//public static By login_btn = By.className("fa-sign-in");
	public static By login_register=By.xpath("//a[@class='sign-in']");  
	public static By Username=By.id("user_login");
	public static By password=By.id("user_pass");
	public static By login_btn=By.xpath("//input[@type='submit']");
	
	
	
}
