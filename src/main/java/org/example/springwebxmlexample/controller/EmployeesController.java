package org.example.springwebxmlexample.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Slf4j
@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping
    public String employees(final Model model) {

        int randomInt = randomInt(1, 10);
        log.info("Random: [{}]", randomInt);
        model.addAttribute("randomValue", randomInt);
        return "employees";
    }

    private int randomInt(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

}
