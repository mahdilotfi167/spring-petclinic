package co.live.petclinic.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.live.petclinic.model.Owner;
import co.live.petclinic.model.Pet;
import co.live.petclinic.service.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    private OwnerService service;

    @GetMapping("")
    public String index(Map<String, Object> model) {
        model.put("owners", service.getOwners());
        return "owners";
    }

    @GetMapping("/new")
    public String newOwner(Map<String, Object> model) {
        model.put("isNew", true);
        model.put("owner", new Owner());
        return "owner-form";
    }

    @GetMapping("/{id}/edit")
    public String editOwner(@PathVariable int id, Map<String, Object> model) {
        model.put("isNew", false);
        model.put("owner", service.getOwner(id));
        return "owner-form";
    }

    @PostMapping("/save")
    public String saveOwner(@ModelAttribute Owner owner) {
        service.saveOwner(owner);
        return "redirect:/owners/" + owner.getId();
    }

    @GetMapping("/{id}")
    public String ownerDetail(Map<String, Object> model, @PathVariable int id) {
        model.put("owner", service.getOwner(id));
        return "owner-detail";
    }

    @GetMapping("/{ownerId}/pets/new")
    public String newPet(@PathVariable int ownerId, Map<String, Object> model) {
        Pet newPet = new Pet();
        newPet.setOwner(service.getOwner(ownerId));
        model.put("pet", newPet);
        model.put("isNew", true);
        model.put("ownerId", ownerId);
        model.put("types", service.getTypes());
        return "pet-form";
    }
    @GetMapping("/{ownerId}/pets/{petId}/edit")
    public String editPet(@PathVariable int ownerId,@PathVariable int petId,Map<String, Object> model) {
        model.put("pet", service.getPet(petId));
        model.put("isNew", false);
        model.put("ownerId", ownerId);
        model.put("types", service.getTypes());
        return "pet-form";
    }
    @PostMapping("/{ownerId}/pets/save")
    public String savePet(@PathVariable int ownerId,@ModelAttribute Pet pet) {
        service.savePet(pet);
        return "redirect:/owners/"+ ownerId;
    }
}
