package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class testcase1 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}

	public void testAddCc() throws EmailException {
		System.out.println("This is test for Cc ID - Lon");
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}

	
    	public void testAddCcMultiple() throws EmailException {
        	System.out.println("Test to add multiple CC addresses ID - Lon"); 
		String [] testEmails = {"a@b.com", "b@c.com"};
        	testEmail.addCc(testEmails);
        	assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
        	assertEquals("b@c.com", testEmail.getCcAddresses().get(1).toString());
    	}


}
