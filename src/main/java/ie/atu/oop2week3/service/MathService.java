package ie.atu.oop2week3.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int subtract(int a, int b) {
        return a - b;
    }
}
