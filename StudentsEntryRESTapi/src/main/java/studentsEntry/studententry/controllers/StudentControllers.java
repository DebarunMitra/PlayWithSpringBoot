package studentsEntry.studententry.controllers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import studentsEntry.studententry.Configs.MoodleCourse;
import studentsEntry.studententry.models.Quote;
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

    @GetMapping("/quotes")
    public Quote getQuotes(){ 
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
        return quote;
    }

    @GetMapping("/moodle")
    public ResponseEntity<String> getMoodleCourse(){ 
         RestTemplate restTemplate = new RestTemplate();
        // MoodleCourse[] moodleCourse = restTemplate.getForObject("https://stage-lms.thecareerlabs.com/webservice/rest/server.php?wstoken=79f1cd9efdb4481101c2c6ecb14c27a2&moodlewsrestformat=json&wsfunction=core_course_get_courses",
        //  MoodleCourse[].class);
        // return (<MoodleCourse>) moodleCourse;
        
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange("https://stage-lms.thecareerlabs.com/webservice/rest/server.php?wstoken=79f1cd9efdb4481101c2c6ecb14c27a2&moodlewsrestformat=json&wsfunction=core_course_get_courses", HttpMethod.GET, entity, String.class);
        return result;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Students student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping("/{studentId}")
    public void updateStudent(
        @PathVariable("studentId") Long studentId,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String email
        ){
        studentService.updateStudent(studentId, name, email);
    }
}
