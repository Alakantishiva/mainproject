package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseSetup;
import com.objectrepository.Locators;

public class login extends BaseSetup{
	
	public void Registration (){
		driver.findElement(Locators.FIRST_NAME).sendKeys("Shiva");;
		driver.findElement(Locators.LAST_NAME).sendKeys("Alakanti");;
	}
	public void Gender() {
		driver.findElement(Locators.GENDER).click();
		
	}
	public void Hobbies() {
	Select dropdown=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
	dropdown.selectByVisibleText("Running");
	
	}
	public void Office() {
		driver.findElement(Locators.DEP).click();
		Select Dropdown =new Select(driver.findElement(Locators.DEP));
		Dropdown.deselectByVisibleText("Tourism Office");
	}
	public void Username() {
		driver.findElement(Locators.USERNAME).sendKeys("Shivaalakanti");
	}
	public void Password() {
		driver.findElement(Locators.PASSWORD).sendKeys("Password");
	}

}
