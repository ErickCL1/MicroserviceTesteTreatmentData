package estudos.java.testesRabbitMQ2.testesRabbitMQ2;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class TestesRabbitMq2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestesRabbitMq2Application.class, args);
	}

}
