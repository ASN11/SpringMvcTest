package school21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExitController {
    @GetMapping("/exit")
    public String exit() {
        return "exit/exit";
    }
}
