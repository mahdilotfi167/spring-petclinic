package co.live.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.live.petclinic.model.Pet;
import co.live.petclinic.repository.PetRepository;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private PetRepository repository;
    @GetMapping("")
    public List<Pet> getPets() {
        return repository.findAll();
    }
}
