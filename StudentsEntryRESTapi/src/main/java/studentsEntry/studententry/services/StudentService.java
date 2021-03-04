package studentsEntry.studententry.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentsEntry.studententry.Repository.StudentRepository;
import studentsEntry.studententry.models.Students;

@Service
public class StudentService {

    @Autowired
    static StudentRepository studentRepository;

    public static List<Students> getStudents() {
        //   List.of(
             //new Students(1L, "Deba" , "deba@test.in", LocalDate.of(2000, Month.JANUARY, 5), 21)
              return studentRepository.findAll();
            //  );
    }
}
