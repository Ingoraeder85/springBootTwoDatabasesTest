package hello.secondDB;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "person_Sequence")
    @SequenceGenerator(name = "person_Sequence", sequenceName = "PERSON_SEQ")
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "job")
    private String job;


    public Person() {

    }

    // getters/setters
}
