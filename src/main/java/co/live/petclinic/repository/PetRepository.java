package co.live.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.live.petclinic.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {
    
}
