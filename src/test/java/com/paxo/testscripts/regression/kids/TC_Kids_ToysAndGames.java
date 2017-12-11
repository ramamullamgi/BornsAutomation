package com.paxo.testscripts.regression.kids;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paxo.helperClasses.BaseClass;
import com.paxo.pageObjects.PrimaryNavigationElements;
import com.paxo.pageObjects.kids.ToysAndGamesElements;

public class TC_Kids_ToysAndGames extends BaseClass{
	
	
	@BeforeClass
	public void navigateToToysAndGameHomePage() throws InterruptedException{				
		Actions actions = new Actions(driver);
		actions.moveToElement(objectFinder(driver, PrimaryNavigationElements.linkKids)).build().perform();		
		Thread.sleep(3000);
		objectFinder(driver, PrimaryNavigationElements.linkToysAndGames,10).click();			
//		objectFinder(driver, ToysAndGamesElements.linkShowMore,60).click();	s		
	}	

	@DataProvider(name = "agesdata-source")
	public Object[][] allAgesElementsInOneShot() {
		return new Object[][] {
			{ "0 - 2 Years",ToysAndGamesElements.link0To2years,60 },
			{ "3 - 5 Years",ToysAndGamesElements.link3To5years,timeout2Sec},
			{ "6 - 8 Years",ToysAndGamesElements.link6To8years,timeout2Sec },
			{ "9 - 12 Years",ToysAndGamesElements.link9To12years,timeout2Sec},
			{ "Teens",ToysAndGamesElements.linkTeens,timeout2Sec }						
		};
	}
	@Test(dataProvider = "agesdata-source", priority=1)
	public void verifyWebElementsInAges(String objectName,By xpath,int timeout) {		
		Assert.assertTrue(objectExists(driver, xpath,timeout), objectName+" is not exists using object properties "+xpath);		
	}
//	
//	@DataProvider(name = "branddata-source")
//	public Object[][] allbrandsElementsInOneShot() {
//		return new Object[][] {
//			{ "linkALEX",ToysAndGamesElements.linkALEX},
//			{ "linkEspariDolls",ToysAndGamesElements.linkEspariDolls},
//			
//		};
//	}
//	@Test(dataProvider = "branddata-source",priority=2)
//	public void verifyWebElementsInRefinementBrands(String objectName,By xpath) {
//		boolean flagRefinementBrandsObjectexistence=objectExists(driver, xpath,timeout2Sec);
//		if(flagRefinementBrandsObjectexistence){
//			try{
//			Actions actions = new Actions(driver);
//			actions.moveToElement(objectFinder(driver, xpath,timeout2Sec)).build().perform();
//			}catch(Exception e){}
//		}
//		Assert.assertTrue(flagRefinementBrandsObjectexistence, objectName+" is not exists using object properties "+xpath);		
//	}
//	
//	@DataProvider(name = "charactersdata-source")
//	public Object[][] allCharactersElementsInOneShot() {
//		return new Object[][] {
//			{ "linkBarbie",ToysAndGamesElements.linkBarbie},
//			{ "linkCalicoCritters",ToysAndGamesElements.linkCalicoCritters},
//			
//		};
//	}
//	@Test(dataProvider = "charactersdata-source", priority=3)
//	public void verifyWebElementsIncharacter(String objectName,By xpath) {		
//		Assert.assertTrue(objectExists(driver, xpath,timeout2Sec), objectName+" is not exists using object properties "+xpath);		
//	}
//	
//	@DataProvider(name = "refineByCategoriesdata-source")
//	public Object[][] allRefineByCategoriesElementsInOneShot() {
//		return new Object[][] {
//			{ "Arts & Crafts",ToysAndGamesElements.linkArtsAndCrafts},
//			{ "Baby Boutiquee",ToysAndGamesElements.linkBabyBoutique},
//			
//		};
//	}
//	@Test(dataProvider = "refineByCategoriesdata-source", priority=4)
//	public void verifyWebElementsInrefineByCategories(String objectName,By xpath) {		
//		Assert.assertTrue(objectExists(driver, xpath,timeout2Sec), objectName+" is not exists using object properties "+xpath);		
//	}
//	
//
//	@DataProvider(name = "pricesdata-source")
//	public Object[][] allPricesElementsInOneShot() {
//		return new Object[][] {
//			{ "Under $5",ToysAndGamesElements.linkUnderDoller5},
//			{ "$5 - $10",ToysAndGamesElements.linkDoller5To10},
//			
//		};
//	}
//	
//	@Test(dataProvider = "pricesdata-source", priority=5)
//	public void verifyWebElementsInPrices(String objectName,By xpath) {		
//		Assert.assertTrue(objectExists(driver, xpath,timeout2Sec), objectName+" is not exists using object properties "+xpath);		
//	}	
//	
//	@DataProvider(name = "buildingAndLEGOdata-source")
//	public Object[][] allbuildingAndLEGOElementsInOneShot() {
//		return new Object[][] {
//			{ "Blocks",ToysAndGamesElements.linkBlocks},
//			{ "Creative Building",ToysAndGamesElements.linkCreativeBuilding},
//			
//		};
//	}
//	
//	@Test(dataProvider = "buildingAndLEGOdata-source", priority=6)
//	public void verifyWebElementsInBuildingAndLEGO(String objectName,By xpath) {
//		boolean flagRefinementBuildingAndLEGOObjectexistence=objectExists(driver, xpath,timeout2Sec);
//		if(flagRefinementBuildingAndLEGOObjectexistence){
//			try{
//			Actions actions = new Actions(driver);
//			actions.moveToElement(objectFinder(driver, xpath,timeout2Sec)).build().perform();
//			}catch(Exception e){}
//		}
//		Assert.assertTrue(flagRefinementBuildingAndLEGOObjectexistence, objectName+" is not exists using object properties "+xpath);		
//	}
	

}
