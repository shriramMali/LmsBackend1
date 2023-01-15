package LmsBackend.example.LmsBackend.Converters;
import LmsBackend.example.LmsBackend.RequestDto.AuthorRequesDto;
import LmsBackend.example.LmsBackend.ResponseDto.AuthorResponseDto;
import LmsBackend.example.LmsBackend.Models.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorConverter {

    public static Author convertDtoToEntity(AuthorRequesDto authorRequesDto){
        Author author=Author.builder().age(authorRequesDto.getAge())
                .name(authorRequesDto.getName()).country(authorRequesDto.getCountry())
                .email(authorRequesDto.getEmail())
                .build();
   return author;

    }


    public static List<AuthorResponseDto> convertEntityToDto(List<Author>authors){
        List<AuthorResponseDto> authorResponseDtoList = new ArrayList<>();
        for(Author author: authors){

            AuthorResponseDto authorRequestDto = AuthorResponseDto.builder().id(author.getId()).name(author.getName()).age(author.getAge())
                    .country(author.getCountry()).email(author.getEmail()).build();

            //Try yourself on how to add BookResponseDto : Good exercise to practice.
            authorResponseDtoList.add(authorRequestDto);
        }

        return authorResponseDtoList;


    }
}
