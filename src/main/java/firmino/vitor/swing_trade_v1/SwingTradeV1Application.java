package firmino.vitor.swing_trade_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SwingTradeV1Application {

	public static void main(String[] args) {
		SpringApplication.run(SwingTradeV1Application.class, args);
	}

}
