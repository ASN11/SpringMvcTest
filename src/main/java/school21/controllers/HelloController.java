package school21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname) {

        System.out.println(name + surname);
        return "hello/hello_world";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "hello/bye";
    }
}
