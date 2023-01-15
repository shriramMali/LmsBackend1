package LmsBackend.example.LmsBackend.Repository;
import LmsBackend.example.LmsBackend.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
