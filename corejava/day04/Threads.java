package com.valtech.training.corejava.day04;

public class Threads {
    static class TestRunnable implements Runnable{
    	public void run() {
    		for(int i=0;i<10;i++) {
    			System.out.println(Thread.currentThread()+" "+i);
    		}
    	}
    	
    }
       
    public static void main(String[] args) {
    	  new Thread(new TestRunnable()).start();
    	  new Thread(new TestRunnable()).start();
    	  new Thread(new TestRunnable()).start();
    	  new Thread(new TestRunnable() {
    		  @Override
    		   public void run() {
    			  for(int i=0;i<10;i++) {
    				  System.out.println(Thread.currentThread()+" "+i);
    				  
    			  }
    		  }
    	  }).start();
    	  new Thread(()->{
    		  for(int i=0;i<10;i++) {
				  System.out.println(Thread.currentThread()+" "+i);
    	  }
    	  }).start();
    	  for(int i=0;i<10;i++) {
    		  System.out.println(Thread.currentThread()+" "+i);
    		  
    	  }
    	  
    }
    
}
