package com.sazakimaeda.spring.springMVC.controllers;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    public static String pidr;
    public static String nahyi;
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){
        //System.out.println("Privet " + name + " " + surname);
        pidr = name;
        nahyi = surname;
        model.addAttribute("message", "Privet " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/bye")
    public String goodByePage() {
        return "first/goodbye";
    }


}
