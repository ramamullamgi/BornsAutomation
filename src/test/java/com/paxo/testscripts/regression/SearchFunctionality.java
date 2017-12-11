package com.paxo.testscripts.regression;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paxo.helperClasses.BaseClass;
import com.paxo.pageObjects.CommonElements;
import com.paxo.pageObjects.HomePageElements;

public class SearchFunctionality extends BaseClass{
	
	@Test
	public void search(){
		
		objectFinder(driver, HomePageElements.inputSearch).sendKeys("barbie");
		objectFinder(driver, HomePageElements.inputsearchSubmit).click();		
		Assert.assertTrue(objectExists(driver, CommonElements.firstProductImageInResultPage), "There are no products with barbie");

	}
	

}
