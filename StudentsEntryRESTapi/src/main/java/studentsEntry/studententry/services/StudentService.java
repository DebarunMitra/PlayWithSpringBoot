package studentsEntry.studententry.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentsEntry.studententry.Repository.StudentRepository;
import studentsEntry.studententry.models.Students;

@Service
public class StudentService {

    private static StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        StudentService.studentRepository = studentRepository;
    }

    public static List<Students> getStudents() {
        // List.of(
        // new Students(1L, "Deba" , "deba@test.in", LocalDate.of(2000, Month.JANUARY,
        // 5), 21)
        return studentRepository.findAll();
            //  );
    }

    public void addNewStudent(Students student){
        Optional<Students> studentByOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentByOptional.isPresent()){
            throw new IllegalStateException("Email Taken");
        }
        studentRepository.save(student);
        // System.out.println(student);
    }

	public void deleteStudent(Long studentId  ) {
        boolean exists = studentRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("Student Not Found With '"+studentId+"' Id");
        }

        studentRepository.deleteById(studentId);
	}
}
