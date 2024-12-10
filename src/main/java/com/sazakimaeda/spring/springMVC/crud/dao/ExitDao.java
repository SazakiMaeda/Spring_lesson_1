package com.sazakimaeda.spring.springMVC.crud.dao;

import com.sazakimaeda.spring.springMVC.controllers.CalculatorController;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ExitDao {
    public static ArrayList<Double> cal = new ArrayList<>();

    public static void calculator() {
        cal.add(CalculatorController.numA);
        cal.add(CalculatorController.numB);
        for (Double d : cal) {
            System.out.println(d);
        }
        System.out.println("======");
        System.out.println(cal.size());
        System.out.println("======");
    }
    public static void delete() {
        cal.remove(1);
        cal.remove(0);
    }
}
