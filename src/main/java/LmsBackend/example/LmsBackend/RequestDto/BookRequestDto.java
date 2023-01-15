package LmsBackend.example.LmsBackend.RequestDto;

import LmsBackend.example.LmsBackend.Enums.Genere;
import lombok.Data;

@Data
public class BookRequestDto {

    private String name;

    private int AuthorId;

    private Genere genere;
}
