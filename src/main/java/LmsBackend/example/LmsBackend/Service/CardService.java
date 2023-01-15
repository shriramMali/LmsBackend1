package LmsBackend.example.LmsBackend.Service;

import org.springframework.stereotype.Service;
import LmsBackend.example.LmsBackend.Models.Card;
import LmsBackend.example.LmsBackend.Models.Student;
import LmsBackend.example.LmsBackend.Enums.CardStatus;
@Service
public class CardService {

    public Card createCard(Student student){

         Card newCard = new Card();


          newCard.setCardStatus(CardStatus.ACTIVATED);

          newCard.setStudent(student);
          return newCard;
    }
}
