package alex.trading.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Check from a browser ot a Postman
 * API to check Git info
 *
 * first rub spring-boot:build-info
 * API to check Build info - http://localhost:8080/actuator/info
 */
@SpringBootApplication
public class AlexTradingOmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlexTradingOmsApplication.class, args);
	}

}
