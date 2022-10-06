package day05;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringSorterTest {

	

	@Test
	public void testVowel() {
    String [] names = {"Abc","Pqr","Lmno","Too","Ab","z"};
    Arrays.sort(names,new StringSorter());
    assertArrayEquals(new String[] {"z","Ab","Abc","Pqr","Too","Lmno"},names);
		
	}
	
	
	@Test
	public void testLength() {
    String [] names = {"Abc","Pqr","Lmno","Ab","z"};
    Arrays.sort(names,new StringSorter());
    assertArrayEquals(new String[] {"z","Ab","Abc","Pqr","Lmno"},names);
		
	}

	
	 @Test
	 public void testalphabet() {
		 String [] names = {"Abc","Pqr","Lmno","Ab","z"};
		 Arrays.sort(names, new StringSorter());
		 assertArrayEquals(new String[] {"z","Ab","Abc","Pqr","Lmno"},names);
	 }
}
