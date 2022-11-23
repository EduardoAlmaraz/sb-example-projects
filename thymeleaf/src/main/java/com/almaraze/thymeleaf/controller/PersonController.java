package com.almaraze.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.almaraze.thymeleaf.service.PersonService;

@Controller
@RequestMapping("/api")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String index(Model model) {
        model.addAttribute("persons", this.personService.getPersons());
        return "index";
    }
}
