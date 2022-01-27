package alex.trading.oms.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * This is a home rest controller
 * All http root requests ("/) mapped to this handler.
 */
//@RestController
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${prodmaster.view.requiredCustomFilter:false}")
    private boolean requiredCustomFilter;

    @Value("${prodmaster.view.batch.limit:300}")
    int batchLimit;

    @RequestMapping("/home")
    //@RequestMapping(value = {"/", "/list"})
    public String home() {
        logger.info("Call {} home method", getClass().getSimpleName());
        logger.info("requiredCustomFilter: {}, batchLimit: {}", requiredCustomFilter, batchLimit);
        return "Alex! The first Updated AWS App, reporting for duty!";
    }



}
