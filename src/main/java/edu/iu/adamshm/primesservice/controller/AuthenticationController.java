package edu.iu.adamshm.primesservice.controller;

import edu.iu.adamshm.primesservice.model.Customer;
import edu.iu.adamshm.primesservice.service.IAuthenticationService;
import edu.iu.adamshm.primesservice.service.TokenService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AuthenticationController {
    private final IAuthenticationService authenticationService;
    public AuthenticationController(IAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    @PostMapping("/register")
    public boolean register(@RequestBody Customer customer) {
        try{
            return authenticationService.register(customer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
