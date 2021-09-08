package co.live.petclinic.service;

import java.util.List;

import co.live.petclinic.model.Owner;

public interface OwnerService {
    public List<Owner> getOwners();
    public Owner getOwner(int id);
}
