package studentsEntry.studententry.controllers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studentsEntry.studententry.models.Students;
import studentsEntry.studententry.services.StudentService;

@RestController
@RequestMapping("/se/api/v1/students")
public class StudentControllers {

    @Autowired
    StudentService studentService;

    @GetMapping("")
    public List<Students> getStudents() { 
        return StudentService.getStudents();
    }

}
