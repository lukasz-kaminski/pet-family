package cx.kaminski.petfamily.pet;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Profile("local")
@RestController
@RequestMapping("/pets")
@RequiredArgsConstructor
class PetEndpoint {
    private final PetRepository petRepository;

    @GetMapping("/{id}")
    public Optional<Pet> getDetails(@PathVariable Long id) {
        return petRepository.findById(id);
    }

    @GetMapping
    public Iterable<Pet> findAll() {
        return petRepository.findAll();
    }

    @PostMapping
    public Pet create(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }
}
