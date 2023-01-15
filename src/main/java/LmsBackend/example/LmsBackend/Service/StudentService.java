package LmsBackend.example.LmsBackend.Service;
import LmsBackend.example.LmsBackend.RequestDto.StudentDto;
import LmsBackend.example.LmsBackend.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import LmsBackend.example.LmsBackend.Models.Card;
import LmsBackend.example.LmsBackend.Repository.StudentRepository;
import LmsBackend.example.LmsBackend.Enums.CardStatus;

@Service
public class StudentService {
@Autowired
CardService cardService;

@Autowired
StudentRepository studentRepository;

    public String createStudent(StudentDto studentDto){
        Student student=new Student();
        student.setAge(student.getAge());
        student.setCountry(student.getCountry());
        student.setEmail(student.getEmail());
        student.setName(student.getName());

        Card newCard=cardService.createCard(student);
        student.setCard(newCard);
        studentRepository.save(student);


        return "Successfully added student and card";
    }

}
