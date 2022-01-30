package alex.trading.oms.controllers;

import alex.trading.oms.model.UserRequestMsg;
import alex.trading.oms.model.mapper.IXmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/user")
    public String user() {

        // from web-model package
        //IXmlMapper.

        logger.info("Call {} hello method", getClass().getSimpleName());
        return "Request Mapping check => Get User from Spring Alex Trading OMS App!";
    }
}
