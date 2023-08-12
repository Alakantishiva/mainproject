package com.testscript;


import org.testng.annotations.Test;

import com.pages.login;

public class LogIn_Functionality extends login{
	

	@Test(priority=1)
	public void testLogin() {
		loginToApp ();
		
	}
	@Test(priority=2)
	public void testsearch() {
		searchAnItem("Zebronics ZEB-KM2100 Multimedia USB Keyboard Comes with 114 Keys Including 12 Dedicated Multimedia Keys & with Rupee Key");
	}
	@Test(priority=3)
	public void amountTest() throws InterruptedException {
		verifyItemAmount("329");	
	}


}
