package LmsBackend.example.LmsBackend.RequestDto;

import LmsBackend.example.LmsBackend.Models.Card;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class StudentDto {

    private int age;

    @Column(nullable = false)
    private String name;


    private String country;

    @Column(nullable = false)
    private String email;

}
