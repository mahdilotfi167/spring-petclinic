package co.live.petclinic.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @GetMapping("/{id}")
    public String ownerDetail(Map<String, Object> model, @PathVariable int id) {
        model.put("owner", service.getOwner(id));
        return "owner-detail";
    }
}
