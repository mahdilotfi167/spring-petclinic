package co.live.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.live.petclinic.model.Vet;
import co.live.petclinic.repository.VetRepository;

@Service
public class VetServiceImpl implements VetService {

    @Autowired
    private VetRepository repository;
    @Override
    public List<Vet> getVets() {
        return this.repository.findAll();
    }
    
}
