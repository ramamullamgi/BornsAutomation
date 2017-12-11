package com.paxo.pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import com.paxo.helperClasses.BaseClass;

public class ShippingAddress extends BaseClass{
	
	public static By inputFirstName=By.id("firstName");
	
	public static By inputLastName=By.id("lastName");
	
	public static By inputStreetAddress=By.id("streetAddress");
	
	public static By inputCity=By.id("city");
	
	public static By linkstate=By.id("state-replacement");
	
	public static By selectState(String state){
		return By.xpath("//div[@class='selectBox-container']//a[text()='"+state+"']");	
	}
	
	public static By inputzipCode=By.id("zipCode");
	
	public static By inputPhoneNumber=By.id("phoneNumber");
	
	
	
	public static void addShippingAddress(HashMap hsmapobj){
		
		objectFinder(driver, inputFirstName).sendKeys(hsmapobj.get("FirstName").toString());
		objectFinder(driver, inputLastName).sendKeys(hsmapobj.get("LastName").toString());
		objectFinder(driver, inputStreetAddress).sendKeys(hsmapobj.get("StreetAddress").toString());
		objectFinder(driver, inputCity).sendKeys(hsmapobj.get("City").toString());
		objectFinder(driver, linkstate).click();
		objectFinder(driver, selectState(hsmapobj.get("State").toString())).click();
		objectFinder(driver, inputzipCode).sendKeys(hsmapobj.get("Zipcode").toString());
		objectFinder(driver, inputPhoneNumber).sendKeys(hsmapobj.get("PhoneNumber").toString());
		
		
	}
	
}
