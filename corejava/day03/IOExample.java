package com.valtech.training.corejava.day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOExample {
	
	

	
	public void writeCharsToFile(String fileName,String data) throws Exception {
		File file = new File(fileName);
		Writer out = new FileWriter(file);
		out.write(data);
		out.close();
	}
	public String readCharsFromFile(String fileName) throws Exception {
		char[] buffer = new char[4];
		File file = new File(fileName);
		Reader in = new FileReader(file);
		int i=-1;
		StringBuffer result = new StringBuffer();
		while((i=in.read(buffer)) != -1) {
			
			System.out.println("Size of Read="+i);
			result.append(buffer,0,i);
		
		}
		in.close();
		return result.toString();
		
	}
	
	
	public String readFromFile(String fileName)throws Exception {
		byte[] buffer = new byte [4];
		File file = new File(fileName);
		InputStream is = new FileInputStream(file);
		int i=-1;
		StringBuffer sb= new StringBuffer();
		
		while((i=is.read(buffer))!=-1) {
			System.out.println("Size of Read="+i);
			sb.append(new String(buffer,0,i));
			
		}
		return sb.toString();
		
	}
  public void writeToFile(String fileName,String contents) throws Exception {
	  byte [] data = contents.getBytes();
	  File file = new File(fileName);
	  OutputStream os = new FileOutputStream(file);
	  os.write(data);
	  os.close();
	  
	}
  

	  
	  public static void main(String[] args) throws Exception {
	        IOExample ex = new IOExample();
	        ex.writeToFile("hello.txt", "Hello World");
	        System.out.println(ex.readFromFile("hello.txt"));
	        ex.writeCharsToFile("hello.txt", "");
	ex.readCharsFromFile("hello.txt");
	
	  }
	  
  }
	

