package co.live.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.live.petclinic.model.Category;
import co.live.petclinic.model.Owner;
import co.live.petclinic.model.Pet;
import co.live.petclinic.repository.CategoryRepository;
import co.live.petclinic.repository.OwnerRepository;
import co.live.petclinic.repository.PetRepository;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private PetRepository petRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    

    @Override
    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner getOwner(int id) {
        return ownerRepository.getById(id);
    }

    @Override
    public void saveOwner(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public Pet getPet(int id) {
        return petRepository.getById(id);
    }

    @Override
    public List<Category> getTypes() {
        return categoryRepository.findAll();
    }

    @Override
    public void savePet(Pet pet) {
        petRepository.save(pet);
    }
}
