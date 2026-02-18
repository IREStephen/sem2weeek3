package ie.atu.oop2week3.controller;

import ie.atu.oop2week3.service.MathService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam int a,
                                      @RequestParam int b) {

        if (a < b) {
            return ResponseEntity.badRequest()
                    .body("a must be greater than or equal to b >:(");
        }

        int result = mathService.subtract(a, b);
        return ResponseEntity.ok(result);
    }
}
