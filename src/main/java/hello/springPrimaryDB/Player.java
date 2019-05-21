package hello.springPrimaryDB;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Player")
public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "player_Sequence")
    @SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "num")
    private int num;

    @Column(name = "position")
    private String position;


    public Player() {

    }

    // getters/setters
}
