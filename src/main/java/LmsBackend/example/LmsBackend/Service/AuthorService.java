package LmsBackend.example.LmsBackend.Service;
import LmsBackend.example.LmsBackend.Models.Author;
import LmsBackend.example.LmsBackend.Repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import LmsBackend.example.LmsBackend.Converters.AuthorConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import LmsBackend.example.LmsBackend.ResponseDto.AuthorResponseDto;
import LmsBackend.example.LmsBackend.RequestDto.AuthorRequesDto;

import java.util.List;

@Service
@Slf4j
public class AuthorService {
@Autowired
AuthorRepository authorRepository;

public String createAuthor(AuthorRequesDto authorRequestDto ){
try{
    Author author=AuthorConverter.convertDtoToEntity(authorRequestDto);
    authorRepository.save(author);
}
   catch ( Exception e){
       return "Create author didnt work";
   }

    return "Author created successfully";
}

    public List<AuthorResponseDto> findAuthorByName(String name){
        List<Author> authors = authorRepository.findByName(name);

        List<AuthorResponseDto> authorResponseDtos = AuthorConverter.convertEntityToDto(authors);

        return authorResponseDtos;
    }


}
