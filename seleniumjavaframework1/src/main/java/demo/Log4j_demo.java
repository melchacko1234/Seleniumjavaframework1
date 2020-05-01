package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_demo {

	private static Logger logger = LogManager.getLogger(Log4j_demo.class);
	
			
	 
	public static void main(String[] args) {
		
System.out.println("\n .. Hello World ..!  \n");

logger.trace("This is a trace message");
 logger.info("This is infomation Message");
 
 logger.error("This is error Message");
 logger.warn("This is warning  Message");
 logger.fatal("This is fatal  Message");
 
 System.out.println("This is completed");
	}

}
