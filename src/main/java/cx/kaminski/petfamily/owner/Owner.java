package cx.kaminski.petfamily.owner;

import cx.kaminski.petfamily.pet.Pet;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@Entity
public class Owner {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "owner")
    private Collection<Pet> pets;
}
