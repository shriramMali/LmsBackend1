package LmsBackend.example.LmsBackend.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Builder
@Data
@AllArgsConstructor
public class AuthorResponseDto {
    private int id;

    private String name;

    private int age;

    private String country;

    private String email;
}
