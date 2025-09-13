package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping
    public String hello() {
        return "<h3>API rodando 🚀<h3>";
    }

}
