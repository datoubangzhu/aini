package iknow.u;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gmzhao
 * @date 2019.3.4
 */
@SpringBootApplication
@EnableEurekaServer
public class AiwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiwoApplication.class, args);
	}

}
