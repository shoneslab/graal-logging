package com.shoneslabs.automation;


import org.tinylog.Logger;

public class OtherClass {
   // private static Logger logger = LoggerFactory.getLogger(OtherClass.class);
    public void printSomeThing(){
        Logger.trace("Starting... (trace)");
        Logger.debug("Starting... (debug)");
        Logger.info("Starting... (info)");
        Logger.warn("Starting... (warn)");
    }
}
