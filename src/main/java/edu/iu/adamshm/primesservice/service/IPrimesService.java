package edu.iu.adamshm.primesservice.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface IPrimesService {
    boolean isPrime(long n);
}
