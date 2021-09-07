package co.live.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.live.petclinic.model.Vet;

public interface VetRepository extends JpaRepository<Vet, Integer> {

}
