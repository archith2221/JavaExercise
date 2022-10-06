package com.valtech.training.corejava.day02;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.valtech.training.corejava.day01.Point;



public class PointSetTest {
 @Test
 public void testTreeSet() {
	 Set<Point> points = new TreeSet<>();
	 points.add(new Point(2,3));
	 assertEquals(1, points.size());
	 points.add(new Point(2,3));
	 assertEquals(1, points.size());
	 points.add(new Point(3,3));
	 assertEquals(1, points.size());
 }
	
	
	@Test
	  public void  testSetOfPoints() {
		 Set<Point> points= new HashSet<>();
		 points.add(new Point(2,3));
		 assertEquals(1, points.size());
		 points.add(new Point(2,3));
		 assertEquals(1, points.size());
	 }
 @Test
  public void testSetOfStringsWithGenerics() {
	 Set<String> myWords = new HashSet<>();
	 myWords.add("Hello");
	 myWords.add("How");
	 myWords.add("You");
	 myWords.add("Are");
	 for (Iterator iterator = myWords.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string);
		
	}
 }
	@Test
    public void testSetofStrings() {
        Set setofStrings = new HashSet<>();
        setofStrings.add("Hello");
        assertEquals(1, setofStrings.size());
        setofStrings.add("Hello");
        assertEquals(1, setofStrings.size());
        setofStrings.add("HEllo");
        assertEquals(2, setofStrings.size());
        setofStrings.add(123);
        for (Iterator iterator = setofStrings.iterator(); iterator.hasNext();) {
            Object object = (Object) iterator.next();
            String s = (String)object;
            System.out.println(s);
	}
	}

}
