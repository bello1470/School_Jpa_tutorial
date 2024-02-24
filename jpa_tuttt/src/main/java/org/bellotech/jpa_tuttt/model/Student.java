package org.bellotech.jpa_tuttt.model;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "student_db")
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"

    )
    private Long studentId;

    private  String firstName;

    private String lastName;

    @Column(name = "email_address",
    nullable = false)
    private String emailId;

    @Embedded
    private Guardian guardian;


}
