package eu.hmichopoulos.example.ui.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class PrincipalController {

    @RequestMapping(value = "/api/currentUser", method = RequestMethod.GET)
    public ResponseEntity<PrincipalDto> currentUser(Principal principal) {
        if (principal == null) {
            return ResponseEntity.badRequest().body(new PrincipalDto());
        } else {
            return ResponseEntity.ok(new PrincipalDto(true, principal.getName()));
        }
    }

}
