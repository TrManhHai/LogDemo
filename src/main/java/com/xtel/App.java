package com.xtel;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Hello world!
 *
 */
public class App {
    private static final Log logger = LogFactory.getLog(App.class);
    public static void main( String[] args ) {

        logger.debug("This is an debu message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}
