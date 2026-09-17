package JAVA.Project_1;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class hello {

    @GetMapping("/hello")
    public String helloworld() {
        return "Hello World!!!";
    }
}