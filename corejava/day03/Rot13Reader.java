package com.valtech.training.corejava.day03;

import java.io.IOException;
import java.io.Reader;

public class Rot13Reader extends Reader {
	
	private Reader source;
	
	
	public Rot13Reader(Reader source) {
		this.source = source;
	}
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException{
		char [] buffer = new char [cbuf.length];
		int i = source.read(buffer);
		if(i == -1) return -1;
		 for (int j = 0; j < buffer.length; j++) {
	            cbuf[i]=Rot13Utility.rotate(buffer[i]);
	        }
	        
		return 0;
	}
@Override
public void close() throws IOException{
	
}
}
