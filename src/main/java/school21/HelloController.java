package school21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Controller JSP is working");
        return "hello_world";
    }
}
