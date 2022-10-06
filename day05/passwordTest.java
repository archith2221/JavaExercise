package day05;

import static org.junit.Assert.*;

import org.junit.Test;

public class passwordTest {

	@Test
	public void testcheckLower() {
		password lwr=new password ();
		assertEquals(true, lwr.checklower("abcdefgh"));

	}

	

	@Test
	public void testUpperLower() {
		password  upr=new password ();
		assertEquals(true, upr.checkupper("ABCDEFGH"));
	}
}

