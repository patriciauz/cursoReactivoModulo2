package edu.co.cedesistemas.reactiva.modulo2.demo;

import edu.co.cedesistemas.reactiva.modulo2.demo.model.Curso;
import edu.co.cedesistemas.reactiva.modulo2.demo.service.KafkaProducerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Modulo2Application {

	private final KafkaProducerService kafkaProducerService;

	public Modulo2Application(KafkaProducerService kafkaProducerService) {
		this.kafkaProducerService = kafkaProducerService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Modulo2Application.class, args);
	}


	public void run(String... args) throws Exception{
		producerData();
	}

	private void producerData(){
		Curso curso = new Curso(100, "Matematicas");
		Curso curso2 = new Curso(101, "Español");
		String topico = "Cursos-primerSemestre";
		kafkaProducerService.sendKey(topico, curso.getId(), curso);
		kafkaProducerService.sendKey(topico, curso2.getId(), curso2);
	}
}
