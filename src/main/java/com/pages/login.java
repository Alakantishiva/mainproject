package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.base.BaseSetup;
import com.objectrepository.Locators;

public class login extends BaseSetup{

	public void loginToApp(){
		System.out.println("Started login");
		driver.findElement(Locators.SINGUP).click();
		driver.findElement(Locators.EMAIL).sendKeys("alakantishivashankar888@gmail.com");
		driver.findElement(Locators.CONTINUE).click();
		driver.findElement(Locators.PASSWORD).sendKeys("Shiva@143*");
		driver.findElement(Locators.SINGUP1).click();
		Assert.assertTrue(driver.findElement(Locators.AMAZONLOGO).isDisplayed());
	}
		public void searchAnItem(String item) {
			System.out.println("Searching an item");
			driver.findElement(Locators.SEARCH).click();
			driver.findElement(Locators.SEARCH).sendKeys(item);
			driver.findElement(Locators.SEARCH_BUTTON).click();
		
			Assert.assertTrue(driver.findElement(Locators.RESULT).isDisplayed());
			System.out.println("Searched item found succesful");
		}
		public void verifyItemAmount(String amount) throws InterruptedException {
			System.out.println("Started verifying Amount forthe product");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,650)", "");
			driver.findElement(Locators.SEARCH_ITEM).click();
			Assert.assertEquals(driver.findElement(Locators.AMOUNTVERIFY).getText(),amount);
			System.out.println("Amount verified is successful");
		}


//		public void dynamicLocator(String text) {
//			WebElement ele = By.xpath("//span[contains(text(),'"+text+"')]";
//		}

	}

