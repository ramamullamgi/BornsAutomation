package com.paxo.pageObjects;

import org.openqa.selenium.By;
import com.paxo.helperClasses.BaseClass;

public class HomePageElements extends BaseClass{
	
	public static By linkSignIn=By.xpath("//a[@id='signInLink']");
	
	public static By inputEmail=By.cssSelector("#email");
	
	public static By inputPassword=By.cssSelector("#password");
	
//	public static By inputSecureSignIn=By.xpath("//input[@value='Secure Sign In']");
	public static By inputSecureSignIn=By.xpath("//button[text()='Secure Sign In']");
	
	
	public static By inputSearch=By.xpath("//input[@id='searchBarBN']");
	
	public static By inputsearchSubmit=By.xpath("//input[@id='searchSubmit']");
	
	
//	public static By SignInWindowIframe=By.xpath("//iframe[@src='/account/login-frame.jsp?tplName=login&parentUrl=http%3a%2f%2fwww.barnesandnoble.com%2f&isCheckout=&isNookLogin=&isEgift=']");
//	public static By SignInWindowIframe=By.xpath("//iframe[@src='/account/login-frame.jsp?tplName=login&parentUrl=http%3a%2f%2fwww.barnesandnoble.com%2f&isCheckout=&isNookLogin=&isEgift=&customerkey=&intent=&emailSub=']");
	public static By SignInWindowIframe=By.xpath("//iframe[@src='https://cdns.us1.gigya.com/gs/webSdk/Api.aspx?apiKey=3_MD_HJHUOCjSeK80xcc1NTYJYTlZXtSSDOc3XHyRvw6dcljSs4YVf8OInYiEPtpeE#origin=https://www.barnesandnoble.com/account/login-frame-ra.jsp?tplName=login&parentUrl=https%3a%2f%2fwww.barnesandnoble.com%2f&isCheckout=&isNookLogin=&isEgift=&customerkey=&intent=&emailSub=&hasGmid=false']");

	//Header Objects
	
	public static By linkHeaderSignIn=By.xpath("//header[@id='globalHeader']//a[@id='signInLink']");
	public static By searcBar=By.xpath("//div[@id='logoContainer']");	
	
	// Footer Objects
	
//	public static By imgVistYourLocalStore=By.xpath("//div[@class='global-footer-promo-row']//h2[text()='Visit Your Local Store']");
	public static By BAndNMemberShip=By.linkText("B&N Membership");
	public static By AboutFreeShipping=By.linkText("About Free Shipping");
	
	
//	public static By imgGiftCards=By.xpath("//div[@class='global-footer-promo-row']//h2[text()='Trade Unused Gift Cards']");
	
	
}
