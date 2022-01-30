package alex.trading.oms.controllers;

import alex.trading.oms.model.json.ShippingAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingJsonController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/shipping")
    public String user() {

        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setCountryName("US");
        shippingAddress.setStreetAddress("123 Main St.");
        shippingAddress.setExtendedAddress("New York, NY");
        shippingAddress.setAdditionalProperty("Florida", new Object());
        shippingAddress.setPostalCode("10024");
        shippingAddress.setLocality("Local");
        shippingAddress.setCountryName("US");
        shippingAddress.setRegion("East");

        System.out.println(shippingAddress);

        // from web-model package
        //IXmlMapper.

        logger.info("Call {} hello method", getClass().getSimpleName());
        return "Request Mapping check => Get ShippingAddress from Spring Alex Trading OMS App!";
    }
}
