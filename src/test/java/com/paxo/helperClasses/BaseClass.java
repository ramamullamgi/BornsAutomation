package com.paxo.helperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.paxo.pageObjects.HomePageElements;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement element;
	public static int timeout2Sec = 2;


	@AfterSuite
	public void closeApp(){
//		driver.quit();
	}
	
	@BeforeSuite
	public static void launchApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", getCurrentProjectDir()+"\\drivers\\chromedriver-windows-32bit.exe");
		driver = new ChromeDriver();		
		driver.get(ResourceBundleManager.getProperty("url"));
		waitForPageToLoad();
//		driver.manage().window().maximize();	
		
		//Login		
		objectFinder(driver, HomePageElements.linkSignIn, 60).click();	
		Thread.sleep(5000);
		driver.switchTo().frame(5);
		objectFinder(driver, HomePageElements.inputEmail).sendKeys("nilotpaul@gmail.com");
		objectFinder(driver, HomePageElements.inputPassword).sendKeys("tom3210");
		objectFinder(driver, HomePageElements.inputSecureSignIn).click();

	}

	public static WebElement objectFinder(WebDriver driver, final By locator,int time) {
		waitForPageToLoad();
		WebDriverWait wait = new WebDriverWait(driver,time);
		return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}


	public static WebElement objectFinder(WebDriver driver, final By locator) {
		waitForPageToLoad();
		WebDriverWait wait = new WebDriverWait(driver,30);
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	

	}

	public static boolean objectExists(WebDriver driver, final By locator) {
		try{
		waitForPageToLoad();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
		return true;
		}
		catch(Exception e){
			return false;
		}

	}
	
	public static boolean objectExists(WebDriver driver, final By locator, int timeout) {
		try{
		waitForPageToLoad();
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
		return true;
		}
		catch(Exception e){
			return false;
		}

	}

	public static void waitForPageToLoad()
	{
		(new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return (((org.openqa.selenium.JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
			}
		});
	}
	
	public static String imageSrcByRemovingSizeParameters(String src){
		String[]  temp = src.split("\\_");
		 return temp[0];		
	}
	
	public static String getCurrentProjectDir(){
		return System.getProperty("user.dir");
	}

}
