package com.paxo.pageObjects;

import org.openqa.selenium.By;
import com.paxo.helperClasses.BaseClass;

public class PrimaryNavigationElements extends BaseClass{
	
	// Toys 
	
	public static By linkKids=By.xpath("//nav[@id='primaryNav']//a[text()='Kids']");
//	public static By linkToysAndGames=By.xpath("//a[text()='Toys & Games']");
	public static By linkToysAndGames=By.xpath("//nav[@id='primaryNav']//a[text()='Kids']/..//div//a[text()='Toys & Games']");
	
	
}
