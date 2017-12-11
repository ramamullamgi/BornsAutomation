package com.paxo.testscripts.sanity;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paxo.helperClasses.BaseClass;
import com.paxo.pageObjects.HomePageElements;



public class FooterValidation extends BaseClass{
	
	@DataProvider(name = "sanityFooterdata-source")
	public Object[][] allFooterElementsInOneShot() {
		return new Object[][] {
			{ "ImageVistYourLocalStore",HomePageElements.BAndNMemberShip},
			{ "ImgGiftCards",HomePageElements.AboutFreeShipping}			
		};
	}

	@Test(dataProvider = "sanityFooterdata-source")
	public void verifyWebElementsInFooter(String objectName,By xpath) {		
		objectFinder(driver, xpath);		
	}

}
