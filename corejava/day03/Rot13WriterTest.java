package com.valtech.training.corejava.day03;

import static org.junit.Assert.assertEquals;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class Rot13WriterTest {
 
	@Test
	public void test() throws Exception {
		Writer strWriter = new Rot13Writer( new StringWriter());
		String msg="Hello World!";
		strWriter.write(msg);
		String res = strWriter.toString();
		System.out.println("After Rotation"+res);
		Reader reader = new StringReader(res);
		char [] buffer = new char[1024];
		int i = reader.read(buffer);
		
		
		assertEquals(msg, new String(buffer,0,i) );
		System.out.println("After rotation again" +new String(buffer,0,i));
	}
	
}
