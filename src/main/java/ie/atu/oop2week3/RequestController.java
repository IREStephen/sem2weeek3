package ie.atu.oop2week3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello world";
    }

    @GetMapping("/hello2")
    public String differentmethod()
    {
        return "hello world";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("Stephen", 22);
    }

    @GetMapping("/calculate")
    public Object calculate(@RequestParam double num1,
                            @RequestParam double num2,
                            @RequestParam String operation) {

        double result;

        switch (operation.toLowerCase()) {

            case "add":
                result = num1 + num2;
                break;

            case "subtract":
                result = num1 - num2;
                break;

            case "multiply":
                result = num1 * num2;
                break;

            case "divide":
                if (num2 == 0) {
                    return "Error: Cannot divide by zero!";
                }
                result = num1 / num2;
                break;

            default:
                return "Invalid operation. Use add, subtract, multiply or divide.";
        }

        return new CalculationResult(operation, result);
    }


}
