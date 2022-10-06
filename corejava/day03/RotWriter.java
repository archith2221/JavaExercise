package com.valtech.training.corejava.day03;

import java.io.Writer;

public class RotWriter extends Writer {
	private Writer sink;
	public Rot13Writer(Writer sink) {
		this.sink=sink;
	}
	
	@Override
	public void write(char[] cbuf, int off,int len) throws IOException {
		char [] buffer = new char [cbuf.length];
		for (int i = 0; i < len; i++) {
			buffer[i] =  .rotate(cbuf[i]);
			
			
		}
		sink.write(buffer,off,len);
		
	}
	@Override
	public void flush() throws IOException
	{
		sink.flush();
		
	}
	@Override
	public void close() throws IOException
	{
		sink.close();
		
	}
}
