package com.paxo.pageObjects;

import org.openqa.selenium.By;
import com.paxo.helperClasses.BaseClass;

public class CommonElements extends BaseClass{
	
	public static By firstProductImageInResultPage=By.xpath("(//div[@class='product-image']//img)[1]");
	
	public static By firstProductLinkInResultPage=By.xpath("(//div[@class='product-info']//a)[1]");
	
	public static By productImageInSummaryPage=By.xpath("//img[@id='pdpMainImage']");
	
	
	
	
}
