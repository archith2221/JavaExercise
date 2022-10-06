package com.valtech.training.corejava.day02;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		String s ="Hello world";
		String s1="Hello world";
		assertTrue(s == s1);
		String s2="Hello"+" "+"world";
		assertTrue(s == s2);
		String s3="world";
		String s4="Hello " +s3;
		assertTrue(s.equals(s4));
		assertFalse(s == s4);
		
	}

}
