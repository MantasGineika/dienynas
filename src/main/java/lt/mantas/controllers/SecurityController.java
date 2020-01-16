package lt.mantas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String showHome() {

        return "home";

    }

    @GetMapping("/destytojai")
    public String showDestytojai() {

        return "destytojai";

    }

    @GetMapping("/adminai")
    public String showAdminai() {

        return "adminai";

    }
}
