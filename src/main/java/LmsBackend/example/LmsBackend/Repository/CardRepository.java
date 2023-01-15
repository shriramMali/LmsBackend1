package LmsBackend.example.LmsBackend.Repository;
import LmsBackend.example.LmsBackend.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CardRepository extends JpaRepository<Card,Integer>{

}
