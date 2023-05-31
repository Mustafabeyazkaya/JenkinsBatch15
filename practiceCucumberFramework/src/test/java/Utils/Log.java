package Utils;

import java.util.logging.*;
import org.apache.log4j.Logger;

public class Log {
    public static Logger log=Logger.getLogger(Log.class.getName());
    public static void startCase(String testCase){
        log.info("****"+testCase+"****");
    }
    public static void endTestCase(String testCaseName){// this will be printed end of your test case
        log.info("############################################");
        log.info("############################################");
        log.info("##############"+testCaseName+"###################");
    }
    public static void info(String message){// this will be printed in middle of your test case
        log.info(message);
    }
    public static void warning(String warning){// this will be printed as a warning in between your test case
        System.out.println(warning);
}}
