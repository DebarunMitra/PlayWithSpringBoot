package studentsEntry.studententry.Configs;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import studentsEntry.studententry.Repository.StudentRepository;
import studentsEntry.studententry.models.Students;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Students deba = new Students("deba", "deba@t.in", LocalDate.of(2000, Month.JANUARY, 5));
            Students mitra = new Students("mitra", "mitra@t.in", LocalDate.of(2004, Month.OCTOBER, 4));
            repository.saveAll(
                List.of(deba, mitra)
            );
        };
    }
}
