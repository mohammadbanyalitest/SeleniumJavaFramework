package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {


    private static Logger logger= LogManager.getLogger(Log4jDemo.class);
    public static void main(String[] args) {


        logger.info("this is test info ");
        logger.error("this is a error messsage ");
        logger.fatal("this is fatal message ");
        logger.warn("this is warning message ");


    }


}
