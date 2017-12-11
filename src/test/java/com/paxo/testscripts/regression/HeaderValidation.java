package com.paxo.testscripts.regression;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.paxo.helperClasses.BaseClass;
import com.paxo.pageObjects.HomePageElements;

public class HeaderValidation extends BaseClass{	

	@DataProvider(name = "sanitydata-source")
	public Object[][] allHeaderElementsInOneShot() {
		return new Object[][] {
			{ "LinkHeaderSignIn",HomePageElements.linkHeaderSignIn },
			{ "SearcBar",HomePageElements.searcBar },			
		};
	}

	@Test(dataProvider = "sanitydata-source")
	public void verifyWebElementsInHeader(String objectName,By xpath) {		
		objectFinder(driver, xpath);		
	}

}
