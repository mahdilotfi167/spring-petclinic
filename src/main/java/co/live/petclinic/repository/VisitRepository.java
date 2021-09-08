package co.live.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.live.petclinic.model.Visit;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
    
}
