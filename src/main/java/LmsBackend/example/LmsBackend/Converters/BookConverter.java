package LmsBackend.example.LmsBackend.Converters;
import LmsBackend.example.LmsBackend.Models.Book;
import LmsBackend.example.LmsBackend.Enums.Genere;
import LmsBackend.example.LmsBackend.RequestDto.BookRequestDto;
public class BookConverter {
    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){

        Book book = Book.builder().name(bookRequestDto.getName()).genere(bookRequestDto.getGenere()).build();
        return book;
    }
}
