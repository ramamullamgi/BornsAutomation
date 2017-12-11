package com.paxo.pageObjects.kids;

import org.openqa.selenium.By;
import com.paxo.helperClasses.BaseClass;

public class ToysAndGamesElements extends BaseClass{


	//Featured in Kids

	//Ages	
	public static By link0To2years=By.xpath("//ul[@id='sidebar-section-Ages']//a[text()='0 - 2 Years']");
	public static By link3To5years=By.xpath("//ul[@id='sidebar-section-Ages']//a[text()='3 - 5 Years']");
	public static By link6To8years=By.xpath("//ul[@id='sidebar-section-Ages']//a[text()='6 - 8 Years']");
	public static By link9To12years=By.xpath("//ul[@id='sidebar-section-Ages']//a[text()='9 - 12 Years']");
	public static By linkTeens=By.xpath("//ul[@id='sidebar-section-Ages']//a[text()='Teen']");

	//HOT DEALS
	public static By linkUpTo30PercentOffFavoriteToyBrands=By.xpath("//ul[@id='sidebar-section-Hot Deals']//a[text()='Up to 30% Off Favorite Toy Brands']");

	//Brands & Characters	
	public static By linkBrio=By.xpath("//ul[@id='Brands & Characters']//a[text()='Brio']"); 	 	
	public static By linkCalicoCritters=By.xpath("//ul[@id='Brands & Characters']//a[text()='Calico Critters']");

	//Categories
	public static By linkArtsAndCrafts=By.xpath("//h2[text()='Categories']//following-sibling::ul/li/a[text()='Arts & Crafts']");	
	public static By linkBabyBoutique=By.xpath("//h2[text()='Categories']//following-sibling::ul/li/a[text()='Brands']");

	//Prices
	public static By linkUnderDoller5=By.xpath("//h2[text()='Prices']//following-sibling::ul/li/a[text()='Under $5']");
	public static By linkDoller5To10=By.xpath("//h2[text()='Prices']//following-sibling::ul/li/a[text()='$5 - $10']");



}
