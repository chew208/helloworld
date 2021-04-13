package mattnew.helloworld.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Greet {

    public String sayHello() {
        return "index";
    }
}
