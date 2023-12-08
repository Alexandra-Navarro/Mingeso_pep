package mingeso.backendconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BackendconfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendconfigServiceApplication.class, args);
	}

}
