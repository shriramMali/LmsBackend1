package LmsBackend.example.LmsBackend.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AuthorRequesDto {

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    private String country;



}
