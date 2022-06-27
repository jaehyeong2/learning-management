package jjfactory.learnmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LearnManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnManageApplication.class, args);
	}

}
