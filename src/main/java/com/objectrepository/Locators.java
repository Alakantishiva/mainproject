package com.objectrepository;

import org.openqa.selenium.By;

public interface Locators {

	public static final By SINGUP= By.id("nav-link-accountList");
	public static final By 	EMAIL = By.name("email");
	public static final By CONTINUE=By.id("continue");
	public static final By PASSWORD=By.name("password");
	public static final By SINGUP1 =By.id("signInSubmit");
	public static final By SEARCH=By.id("twotabsearchtextbox");
	public static final By SEARCH_BUTTON=By.id("nav-search-submit-button");
	public static final By AMAZONLOGO=By.id("nav-logo-sprites");
	public static final By RESULT=By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold']");
	public static final By SEARCH_ITEM=By.xpath("//span[contains(text(),'Zebronics Zeb-Power')]");
	public static final By AMOUNTVERIFY=By.xpath("//span[contains(@class,'a-price-whole')]");
}
	