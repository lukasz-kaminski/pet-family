package cx.kaminski.petfamily.pet;

import org.springframework.data.repository.CrudRepository;
 interface PetRepository extends CrudRepository<Pet, Long> {
}
