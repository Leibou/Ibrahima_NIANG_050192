package org.anywrtest.api.student;

import org.anywrtest.common.Constants;
import org.anywrtest.entities.Student;
import org.anywrtest.services.StudentService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.STUDENT_API_PATH)
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String filter
    ){
        List<Student> studentList = studentService.getAllStudents(pageNo, pageSize, filter);
        return  new ResponseEntity<>(studentList, new HttpHeaders(), HttpStatus.OK);
    }
}
