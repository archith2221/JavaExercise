package com.valtech.training.corejava.day03;



public class GCTest1 {

	
	public static void main(String[] args) {
		int n = Integer.parseInt(args [0]);
		long x = System.nanoTime();
		for (int i = 0; i < n; i++) {
			String s =" "+i+" "+i+" "+i;
		  }
		long y = System.nanoTime();
		long time  = (y-x)/1000000000;
			 System.out.println("time taken="+time+"secs");
		}

}



