package edu.iu.adamshm.primesservice.controller;

import edu.iu.adamshm.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    @GetMapping
    public String primeIsRunning() {
        return "Primes service is running!";
    }
    IPrimesService primesService;
    public PrimesController(IPrimesService primesService) {

        this.primesService = primesService;
    }
    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable long n) {

        return primesService.isPrime(n);
    }
}
