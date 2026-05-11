package com.ranking.microservicio_ranking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicioRankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioRankingApplication.class, args);
	}

}
