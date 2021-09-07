package co.live.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.live.petclinic.model.Vet;
import co.live.petclinic.service.VetService;

@RestController
public class VetController {
    @Autowired
    private VetService service;
    @GetMapping
    public List<Vet> index() {
        return this.service.getVets();
    }
}
