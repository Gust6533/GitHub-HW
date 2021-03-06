package com.viturialpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkvalidISBN() {
		ValidateISBN val = new ValidateISBN();
		boolean result = val.checkISBN("0140449116");
		assertTrue("first isbn", result);
		result = val.checkISBN("0140177396");
		assertTrue("second isbn",result);
	}

	@Test
	public void checkinvalidISBN() {
		ValidateISBN val = new ValidateISBN();
		boolean result = val.checkISBN("0140449117");
		assertFalse(result);
	}
	
	@Test(expected=NumberFormatException.class)
	public void ninedigittestsarenotallowed() {
		ValidateISBN val = new ValidateISBN();
		boolean result = val.checkISBN("123456789");
	}
	
	@Test(expected=NumberFormatException.class)
	public void charactersarenotallowed() {
		ValidateISBN val = new ValidateISBN();
		boolean result = val.checkISBN("HelloWorld");
	}	
}
