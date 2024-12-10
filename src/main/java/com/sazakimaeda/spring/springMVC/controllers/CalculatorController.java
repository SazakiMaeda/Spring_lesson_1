package com.sazakimaeda.spring.springMVC.controllers;

import com.sazakimaeda.spring.springMVC.crud.dao.ExitDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class CalculatorController {
    public static Double numA;
    public static Double numB;
    private final ExitDao exitDao;

    public CalculatorController(ExitDao exitDao) {
        this.exitDao = exitDao;
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "A", required = false) Double A,
                                    @RequestParam(value = "B", required = false) Double B,
                                    @RequestParam(value = "action", required = false) String action,
                             Model model) {
        double result;
        if (A != null && B != null && action != null) {
            numA = A;
            numB = B;
            exitDao.calculator();
            if (action.equals("plus")) {
                result = A + B;
                model.addAttribute("message", A + " + " + B + " = " + result);
            } else if (action.equals("minus")) {
                result = A - B;
                model.addAttribute("message", A + " - " + B + " = " + result);
            } else {
                model.addAttribute("message", "Dolbaeb?");
            }
            exitDao.delete();
        } else if (A != null && B == null && action == null){
            numA = A;
            exitDao.cal.add(A);
            model.addAttribute("message", exitDao.cal.get(0));
            exitDao.cal.remove(0);
        } else {
            model.addAttribute("message", "Say parametrs, \"A\", \"B\", \"action\".");
        }

        return "first/calculator";
    }
}
