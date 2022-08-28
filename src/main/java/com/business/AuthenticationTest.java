package com.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class AuthenticationTest {

	@Test
	@DisplayName("Testcase for Authenticating of UserID")
	void Userid_Authenticate() {
		assertNotNull(Details.id);
		assertEquals(Details.Userid,Details.id);
	}
	
	@Test
	@DisplayName("Testcase for Authenticating of UserPassword")
	void Userpass_Authenticate() {
		assertNotNull(Details.pass);
		assertEquals(Details.Userpass, Details.pass);
	}
	
	@BeforeAll
	@DisplayName("First Testcase.")
	static void authenticationTestCase() {
		Details.inputID();
		Details.inputPassword();
	    
	    assertNotNull(Details.id);
	    assertNotNull(Details.pass);		
	}
	
	@AfterAll
	@DisplayName("Last Testcase.")
	static void last() {
		
		if (Details.authenticate())
			System.out.println("Authentication Successfull...");
		else System.out.println("Authentication Failed...");
		
		Details.id = null;
		Details.pass = null;
		
		assertNull(Details.id);
		assertNull(Details.pass);
	}

}