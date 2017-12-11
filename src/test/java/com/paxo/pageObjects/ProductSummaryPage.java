package com.paxo.pageObjects;

import org.openqa.selenium.By;
import com.paxo.helperClasses.BaseClass;

public class ProductSummaryPage extends BaseClass{
	
	public static By firstProductImageInResultPage=By.xpath("(//div[@class='product-image']//img)[1]");
	
	public static By firstProductLinkInResultPage=By.xpath("(//div[@class='product-info']//a)[1]");
	
	public static By inputAddToBag=By.xpath("//input[@value='Add to Bag']");
	
	public static By linkViewShoppingBagg=By.xpath("//a[@id='viewShoppingBag']");
	
	public static By linkcontinue=By.xpath("//input[@id='continue']");
	
	public static By linkAddShipping=By.xpath("//a[@data-modal-class='BN.Modal.Checkout.AddShipping']");	
	
}
