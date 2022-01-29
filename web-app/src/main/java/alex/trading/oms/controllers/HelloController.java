package alex.trading.oms.controllers;

//import alex.trading.oms.model.User;
import alex.trading.oms.model.UserRequestMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello() {

        // from web-model package
        UserRequestMsg user = new UserRequestMsg();

        logger.info("Call {} hello method", getClass().getSimpleName());
        return "Request Mapping check => Updated Greetings from Spring Alex Boot App!";
    }



}
