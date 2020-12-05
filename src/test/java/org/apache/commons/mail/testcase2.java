package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class testcase2 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddCc() throws EmailException {
		System.out.println("Test to add CC address ID - Lon");
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}  
	
	
    	public void testAddBccMultiple() throws EmailException {
		System.out.println("Test to add multiple BCC addresses ID - Lon"); 
        	String [] testEmails = {"a@b.com", "b@c.com"}; 
        	testEmail.addBcc(testEmails);
        	assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString()); 
        	assertEquals("b@c.com", testEmail.getBccAddresses().get(1).toString()); 
    	}

}
