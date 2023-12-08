package mingeso.backendplanesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BackendPlanesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendPlanesServiceApplication.class, args);
	}

}
