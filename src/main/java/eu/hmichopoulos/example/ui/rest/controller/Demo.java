package eu.hmichopoulos.example.ui.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Demo {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public ResponseEntity<GreetingDto> sayHi() {
        return ResponseEntity.ok(new GreetingDto("Hi"));
    }

    @RequestMapping(value = "/secure/hi", method = RequestMethod.GET)
    public ResponseEntity<GreetingDto> sayHiSecurely() {
        return ResponseEntity.ok(new GreetingDto("Hi with high security!"));
    }

    @RequestMapping(value = "/secure/hi", method = RequestMethod.POST)
    public void getHi(@RequestBody GreetingDto greetingDto) {
        System.out.println("Somebody is saying ... " + greetingDto.getGreeting());
    }
}
