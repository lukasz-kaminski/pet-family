package cx.kaminski.petfamily.pet;

import cx.kaminski.petfamily.owner.Owner;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String breed;
    private Kind kind;
    @Lob
    private String image;
    @ManyToOne
    private Owner owner;

}
