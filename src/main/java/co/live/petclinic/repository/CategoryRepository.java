package co.live.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.live.petclinic.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
