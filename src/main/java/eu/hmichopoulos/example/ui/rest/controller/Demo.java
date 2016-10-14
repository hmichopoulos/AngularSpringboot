package eu.hmichopoulos.example.ui.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Demo {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi() {
        return "Hi";
    }
}
