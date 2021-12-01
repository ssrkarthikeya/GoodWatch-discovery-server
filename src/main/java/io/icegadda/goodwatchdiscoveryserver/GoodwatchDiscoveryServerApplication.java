package io.icegadda.goodwatchdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GoodwatchDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodwatchDiscoveryServerApplication.class, args);
	}

}
