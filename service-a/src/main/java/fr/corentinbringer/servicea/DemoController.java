package fr.corentinbringer.servicea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${app.env:n/a}")
    private String env;

    @GetMapping("/demo")
    public String demo() {
        return env;
    }
}
