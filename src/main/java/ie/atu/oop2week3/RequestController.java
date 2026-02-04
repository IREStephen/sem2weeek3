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

}
