package school21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Controller is working");
        return "hello_world";
    }

    @GetMapping("/bye")
    public String sayBye() {
        System.out.println("Controller is working");
        return "bye";
    }
}
