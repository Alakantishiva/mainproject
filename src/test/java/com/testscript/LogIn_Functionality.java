package com.testscript;


import org.testng.annotations.Test;

import com.pages.login;

public class LogIn_Functionality extends login{
	

	@Test
	public void testlogin() {
		Registration ();
		Gender();
		Hobbies();
		Office();
		
	}
	
	


}
