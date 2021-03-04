package studentsEntry.studententry.controllers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studentsEntry.studententry.models.Students;

@RestController
@RequestMapping("/se/api/v1/students")
public class StudentControllers {
    

    @GetMapping("")
    public List<Students> hello() {
        return List.of(
            new Students(1L, "Deba" , "deba@test.in", LocalDate.of(2000, Month.JANUARY, 5), 21)
        );
    }

}
