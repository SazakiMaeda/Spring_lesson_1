package com.sazakimaeda.spring.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;

import static com.sazakimaeda.spring.springMVC.controllers.FirstController.nahyi;
import static com.sazakimaeda.spring.springMVC.controllers.FirstController.pidr;

@Controller
@RequestMapping("/second")
public class SecondController {

    @GetMapping("/exit")
    public String exit(@RequestParam(value = "name", required = false) String name,
                       @RequestParam(value = "surname", required = false) String surname,
                       Model model) {
        System.out.println(name + " " + surname);

        if (name == null || surname == null) {
            model.addAttribute("message", "No name");
        } else {
            if (name.equals("Tom")) {
                name = "lox";
                model.addAttribute("message", name + " " + surname);
            }
        }
        return "second/exit";
    }
}