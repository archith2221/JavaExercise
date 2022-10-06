package day05;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class  factorial{
	 



		   public long fact(long n) {
		        long fac=1;
		        if(n<=1) {
		            return fac;
		            
		        }
		        else
		        {
		            fac=n*fact(n-1);
		            return fac;
		        }
		    }
		    ArrayList<Long> arr = new ArrayList<>();




		    public long cach(long n) {
		        long si=arr.size();
//		        long def=1*2*3*4*5*6*7*8*9*10;
		        long fac2;
		        if (si>=n) {
		            return arr.get((int) (n-1));
		        }
		        else if(n==1) {
		            arr.add(1L);
		            return 1;
		        }
		        else {
		            fac2=n*fact(n-1);
		            arr.add(fac2);
		        }
		        return fac2;
		        
		    }
		    public static void main(String[] args) {
		        factorial r=new factorial();
		        System.out.println(r.fact(20));
		        System.out.println(r.cach(3));
		        
		    }
		}


	 
	
	