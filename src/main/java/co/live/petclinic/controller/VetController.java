package co.live.petclinic.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.live.petclinic.service.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {
    @Autowired
    private VetService service;

    @GetMapping("")
    public String index(Map<String, Object> model) {
        model.put("vets", service.getVets());
        return "vets";
    }
}