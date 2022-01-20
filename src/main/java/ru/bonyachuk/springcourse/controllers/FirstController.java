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
            @RequestParam(value = "a", required = false) Integer number1,
            @RequestParam(value = "b", required = false) Integer number2,
            @RequestParam(value = "action", required = false) String operation,
            Model model) {

        int result = 0;
        if ((number1 != null) && (number2 != null)) {
            result = number1 * number2;

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
                    result = number1 / number2;
                    break;
                default:
                    break;
            }
        }

        model.addAttribute("message_calc", result);

        return "first/calculator";
    }
}
