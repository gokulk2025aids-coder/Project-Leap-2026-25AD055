package JAVA.Project_1.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping("/getall")
    String getall()
    {
        return "Method to get all";
    }
    @GetMapping("getbyid/{id}")
    String getbyId(@PathVariable long id)
    {
        return "Todo with id " + id;
    }
    @PostMapping("/create")
    String createtodo(@RequestBody String body)
    {
        return "success";
    }
}
