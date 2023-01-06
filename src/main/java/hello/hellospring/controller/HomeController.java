package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // "/" 매핑을 안해주면 자동으로 index.html을 찾아감
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
