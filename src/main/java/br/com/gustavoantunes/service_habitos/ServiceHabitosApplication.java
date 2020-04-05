package br.com.gustavoantunes.service_habitos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ServiceHabitosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHabitosApplication.class, args);
	}

}
