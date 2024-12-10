package com.sazakimaeda.spring.springMVC.controllers.info;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class informationController {

    /*
    * То что хотел сделать стало впадлу
    */


    @GetMapping("/calculator")
    public static String info(@RequestParam(value = "value")String info, Model model) {
//        if (exitDao.cal.size() >= 2) {
//            model.addAttribute("info", "Entering: " +
//                    exitDao.cal.get(0) + " " + exitDao.cal.get(1));
//        } else {
//            model.addAttribute("info", "Enter number: ");
//        }
        model.addAttribute("info", info);
        return "first/calculator";
    }
}
