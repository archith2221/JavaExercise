package com.valtech.training.corejava.day04;

public class VarArgs {
	  public int add(int...a) {
		int res = 0;
		for(int i:a) {
			res+=i;
			
		}
		return res;
		
	}

}
