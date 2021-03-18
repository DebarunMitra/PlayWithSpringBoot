package studentsEntry.studententry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudententryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudententryApplication.class, args);
	}

}
