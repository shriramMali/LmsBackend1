package LmsBackend.example.LmsBackend.Controllers;
import LmsBackend.example.LmsBackend.Service.StudentService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import LmsBackend.example.LmsBackend.RequestDto.StudentDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
 StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody() StudentDto studentDto){
        String result = studentService.createStudent(studentDto);

        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }


}
