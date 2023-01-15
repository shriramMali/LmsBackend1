package LmsBackend.example.LmsBackend.Repository;

import LmsBackend.example.LmsBackend.Models.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
