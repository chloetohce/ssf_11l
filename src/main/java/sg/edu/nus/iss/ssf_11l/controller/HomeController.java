package sg.edu.nus.iss.ssf_11l.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @RequestMapping(path="/log", method=RequestMethod.GET) //method: method is only retrievable if it is a GET method
    @ResponseBody //Take the string, and convert it to the web content
    public String home() {
        logger.info("This is a info message"); // If you don't specify where to log to, it will output as a console string
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message");
        logger.trace("This is a trace message.");

        return "logging to console";
    }
    
}
