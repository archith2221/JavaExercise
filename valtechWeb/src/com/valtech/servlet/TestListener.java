package com.valtech.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
public class TestListener implements ServletContextListener {

   @Override
public void contextDestroyed(ServletContextEvent sce) {
	   System.out.println("Application is Destroyed");
	   
    	
}	
   
   @Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
