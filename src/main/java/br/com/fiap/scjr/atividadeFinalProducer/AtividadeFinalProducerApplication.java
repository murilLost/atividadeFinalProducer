package br.com.fiap.scjr.atividadeFinalProducer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class AtividadeFinalProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeFinalProducerApplication.class, args);
	}

}
