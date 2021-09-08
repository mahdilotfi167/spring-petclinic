package co.live.petclinic.service;

import java.util.List;

import co.live.petclinic.model.Category;
import co.live.petclinic.model.Owner;
import co.live.petclinic.model.Pet;

public interface OwnerService {
    public List<Owner> getOwners();
    public Owner getOwner(int id);
    public void saveOwner(Owner owner);
    public Pet getPet(int id);
    public List<Category> getTypes();
    public void savePet(Pet pet);
}
