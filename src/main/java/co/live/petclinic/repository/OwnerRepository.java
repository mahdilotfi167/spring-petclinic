package co.live.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.live.petclinic.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    
}
