package com.myProjects.learning_core_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	log.info("Hello world");
    }
    
    protected void protectedTest() {
    	log.info("protected method");
    }
}

