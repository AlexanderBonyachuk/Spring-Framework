package ru.bonyachuk.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        String outMessage = "Hello, " + name + " " + surname;
        model.addAttribute("message", outMessage);


        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(
            @RequestParam("a") int number1,
            @RequestParam("b") int number2,
            @RequestParam("action") String operation,
            Model model) {

        double result;

            switch (operation) {
                case "multiplication":
                    result = number1 * number2;
                    break;
                case "addition":
                    result = number1 + number2;
                    break;
                case "subtraction":
                    result = number1 - number2;
                    break;
                case "division":
                    result = number1 / (double) number2;
                    break;
                default:
                    result = 0;
                    break;
            }

        model.addAttribute("result", result);

        return "first/calculator";
    }
}
