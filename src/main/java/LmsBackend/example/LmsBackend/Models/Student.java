package LmsBackend.example.LmsBackend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="student_table")
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(nullable = false)
private String name;

@Column(name = "school_email",unique = true,nullable = false)
private String email;

@Column(columnDefinition="varchar(255) default'India' ")
private String country;

private int age;

@CreationTimestamp
private Date createdOn;

@UpdateTimestamp
private Date updatedOn;

    @OneToOne(mappedBy = "student" ,cascade = CascadeType.ALL)
    private Card card;

    public Student(String name, String email, int age, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }

}
