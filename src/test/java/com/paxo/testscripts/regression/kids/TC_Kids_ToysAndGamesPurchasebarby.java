package com.paxo.testscripts.regression.kids;

import java.util.HashMap;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.paxo.helperClasses.BaseClass;
import com.paxo.helperClasses.ReadXlsxDataHelper;
import com.paxo.pageObjects.CommonElements;
import com.paxo.pageObjects.PrimaryNavigationElements;
import com.paxo.pageObjects.ProductSummaryPage;
import com.paxo.pageObjects.ShippingAddress;
import com.paxo.pageObjects.kids.ToysAndGamesElements;


public class TC_Kids_ToysAndGamesPurchasebarby extends BaseClass{
	
	HashMap shppingAddresshsMapObj;
	
	@BeforeClass
	public void navigateToToysAndGameHomePage() throws InterruptedException{				
		Actions actions = new Actions(driver);
		actions.moveToElement(objectFinder(driver, PrimaryNavigationElements.linkKids)).build().perform();		
		Thread.sleep(3000);
		objectFinder(driver, PrimaryNavigationElements.linkToysAndGames,10).click();			
	
	}	

	@Test
	public void selectBarbie() throws Exception{
		
//		objectFinder(driver, ToysAndGamesElements.linkShopByCategory_Barbie,90).click();
		
		String imgSrcInSearchResults=objectFinder(driver, CommonElements.firstProductImageInResultPage).getAttribute("src");
		
		objectFinder(driver, CommonElements.firstProductLinkInResultPage).click();
		
		String imgSrcInSummaryPage=objectFinder(driver, CommonElements.productImageInSummaryPage).getAttribute("src");
		
		Assert.assertTrue(imageSrcByRemovingSizeParameters(imgSrcInSearchResults).equalsIgnoreCase(imageSrcByRemovingSizeParameters(imgSrcInSummaryPage)), "Image src in SearchResults Page is not equal with Product Summary Page");
		
		objectFinder(driver, ProductSummaryPage.inputAddToBag).click();
		
		objectFinder(driver, ProductSummaryPage.linkViewShoppingBagg).click();
		
		objectFinder(driver, ProductSummaryPage.linkcontinue).click();
		
		objectFinder(driver, ProductSummaryPage.linkAddShipping).click();	
		
		shppingAddresshsMapObj = ReadXlsxDataHelper.getXlsxRowDataAsMap("ShppingAddress", "PrimaryAddress", 1);
		ShippingAddress.addShippingAddress(shppingAddresshsMapObj);
		
		
	}
	

}
