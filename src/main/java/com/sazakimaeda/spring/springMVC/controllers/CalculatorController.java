package com.sazakimaeda.spring.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "A", required = false) Double A,
                                    @RequestParam(value = "B", required = false) Double B,
                                    @RequestParam(value = "action", required = false) String action,
                             Model model){
        double result;
        if (A !=null && B !=null && action !=null) {
            if (action.equals("plus")) {
                result = A + B;
                model.addAttribute("message", A + " + " + B + " = " + result);
            } else if (action.equals("minus")) {
                result = A - B;
                model.addAttribute("message", A + " - " + B + " = " + result);
            } else {
                model.addAttribute("message", "Dolbaeb?");
            }
        } else {
            model.addAttribute("message", "Say parametrs, \"A\", \"B\", \"action\".");
        }

        return "first/calculator";
    }
}
