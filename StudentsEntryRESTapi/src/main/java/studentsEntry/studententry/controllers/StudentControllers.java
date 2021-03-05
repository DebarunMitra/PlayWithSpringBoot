package studentsEntry.studententry.controllers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studentsEntry.studententry.models.Students;
import studentsEntry.studententry.services.StudentService;

@RestController
@RequestMapping("/se/api/v1/students")
public class StudentControllers {

    private static StudentService studentService;

    @Autowired
    public StudentControllers(StudentService studentService) {
        StudentControllers.studentService = studentService;
    }


    @GetMapping("")
    public List<Students> getStudents() { 
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Students student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }
}
